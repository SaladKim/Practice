package com.acompany.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TheDayMartOff implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        // 1. 계산을 위한 기준날짜
        LocalDate theDay = LocalDate.from(temporal);
        // 2. 둘째 넷째 일요일을 구한다.
        LocalDate secondSunday =
                theDay.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
        LocalDate fourthSunday =
                theDay.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.SUNDAY));
        // 3. 기준날짜가 둘째 일요일 이전이면 둘째 일요일, 넷째 일요일 이전이면 넷째 일요일
        //    둘 다 아니면 다음달 둘째 일요일은 반환한다.
        if (theDay.isBefore(secondSunday)) {
            return secondSunday;
        } else if (theDay.isBefore(fourthSunday)) {
            return fourthSunday;
        } else {
            return theDay.plusMonths(1)
                    .with(TemporalAdjusters.dayOfWeekInMonth(2,DayOfWeek.SUNDAY));
        }
    }
}
