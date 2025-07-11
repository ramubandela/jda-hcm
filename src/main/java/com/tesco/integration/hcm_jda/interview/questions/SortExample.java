package com.tesco.integration.hcm_jda.interview.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample {

    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.89);
        List<Double> collect1 = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("collect1"+collect1);

        List<Double> collect2 = decimalList.stream()
                .sorted(Comparator.comparing(Double::doubleValue).reversed())
                .collect(Collectors.toList());


        decimalList.stream()
                .sorted(Comparator.comparing(x->((Double) x).doubleValue()).reversed())
                .collect(Collectors.toList());


        List<Integer> ints = Arrays.asList(12, 23, 17, 42, 33, 71);
        List<Integer> collect3 = ints.stream().sorted(Comparator.comparing(x -> ((Integer) x).intValue()).reversed()).collect(Collectors.toList());
        System.out.println(collect3);

        List<Integer> collect = ints.stream().map(x -> x.intValue()).sorted(Comparator.comparing(x -> x)).collect(Collectors.toList());

        System.out.println(collect+"collect");

        List<Double> collect4 = decimalList.stream().sorted().collect(Collectors.toList());
        System.out.println("collect4"+collect4);
        List<Double> collect5 = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());


    }
}
