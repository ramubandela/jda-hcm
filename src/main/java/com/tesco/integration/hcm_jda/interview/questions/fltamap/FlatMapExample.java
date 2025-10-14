package com.tesco.integration.hcm_jda.interview.questions.fltamap;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfLists = List.of(
                List.of("A", "B"),
                List.of("C", "D"),
                List.of("E", "F")
        );
        listOfLists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
    }
}
