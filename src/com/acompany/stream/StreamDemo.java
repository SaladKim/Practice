package com.acompany.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("cities.txt");

        Stream<String> stringStream = Files.lines(path);
        Optional<Integer> integer =
        stringStream.map(l -> Integer.parseInt(l.split(",")[2].trim()))
                .filter(p -> p >= 1_000_000)
                .reduce((a,b) -> a + b);
                //.forEach(System.out::println);

        integer = Optional.empty();

        //integer.ifPresent(System.out::println);
        int data = integer.orElse(0);
        System.out.println(data);
    }
}
