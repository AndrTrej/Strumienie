package edu.andrzej._1_wprowadzenie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Wprowadzenie {
    public static void main(String[] args) {

//        -----------------------

//        Stream<Integer> s = Stream.iterate(1, x -> x + 1);
//        s.forEach(System.out::println);

//        -----------------------
        List<String> imiona = Arrays.asList("Ala", "Jacek");
        List<String> nowaListaImion = imiona
                .stream()
                .filter(imie -> imie.endsWith("a"))
                .collect(Collectors.toList());
        System.out.println(nowaListaImion);

    }
}
