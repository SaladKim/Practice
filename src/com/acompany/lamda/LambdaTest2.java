package com.acompany.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTest2 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(
            Arrays.asList("cat", "hippo", "a","giraffe", "elephant", "monkey", "")
        );
/*        AnimalPredicate animalPredicate = new AnimalPredicate();
        animals.removeIf(animalPredicate);*/

/*        animals.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() < 2;
            }
        });*/

        animals.removeIf((s) -> s.length() < 2);

        System.out.println(animals);
    }

/*    static class AnimalPredicate implements Predicate<String> {
        @Override
        public boolean test(String s) {
            return s.length() < 2;
        }
    }*/

}
