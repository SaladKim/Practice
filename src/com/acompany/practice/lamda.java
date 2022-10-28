package com.acompany.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class lamda {
    public static void main(String[] args) {
        String[] weapon = {"greatSword", "gun", "stick", "mace", "spear"};
        //Arrays.sort(weapon, (o1, o2) -> o1.length() - o2.length());
        weaponComparator comparator = new weaponComparator();
        Arrays.sort(weapon,comparator);

        for(String item : weapon) {
            System.out.println(item);
        }

        List<String> fruits = new ArrayList<>(Arrays.asList("apple","pineapple","grape","banana"));

        fruits.removeIf((s) -> s.length() > 5);

        System.out.println(fruits);
    }

    public static class weaponComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
}
