package com.tesco.integration.hcm_jda.interview.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerSorting {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 4, 5, 89, 789, 657);
        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect+"natural sorting ");

        //reverse order

        List<Integer> collect1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect1);



    }

}
