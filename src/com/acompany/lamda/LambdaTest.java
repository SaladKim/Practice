package com.acompany.lamda;

import java.util.Arrays;

public class LambdaTest {
    public static void main(String[] args) {
        String[] animals = {"cat", "hippo", "giraffe", "elephant", "monkey", ""};
/*        AnimalComparator comparator = new AnimalComparator();
        Arrays.sort(animals, comparator);*/

        Arrays.sort(animals, (o1, o2) -> o1.length() - o2.length());

        for (String item : animals) {
            System.out.println(item);
        }
    }

/*    static class AnimalComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }*/

}
