package com.acompany.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class NewDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate baseDate = LocalDate.of(2018, 5, 5);
        LocalTime timeToBed = LocalTime.of(22,30,25);

        System.out.println(now);
        System.out.println(baseDate.plusDays(99).plusMonths(2).minusMonths(2));
        System.out.println(timeToBed);

        System.out.println(baseDate.with(TemporalAdjusters.lastDayOfMonth()));

        System.out.println(baseDate.with(new TheDayMartOff()));

        String formattedDate = DateTimeFormatter.ofPattern("G yyyy.MM.dd.HH:mm")
                .format(now);
        System.out.println(formattedDate);
    }
}
