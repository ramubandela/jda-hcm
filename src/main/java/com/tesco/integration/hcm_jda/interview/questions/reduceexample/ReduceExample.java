package com.tesco.integration.hcm_jda.interview.questions.reduceexample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceExample {
    public static void main(String[] args) {
        List<String> list = List.of("Tamu", "rahul", "ajaya", "testy teja");
        Optional<String> reduce = list.stream().reduce((a, b) -> a.length() > b.length() ? a : b);
        System.out.println("reduce"+reduce);

        Integer a[]={5,8,9,10};

        Map<Integer, Integer> collect = Arrays.stream(a).map(x -> x).collect(Collectors.toMap(x -> x, y -> y));
        System.out.println(collect+"collect");

    }
}
