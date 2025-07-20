package com.tesco.integration.hcm_jda.interview.questions;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Partion {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 4, 89, 90, 100);


        Map<Boolean, List<Integer>> collect = integers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
System.out.println(collect+"collect");



    }


}
