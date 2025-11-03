package com.tesco.integration.hcm_jda.interview.questions.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNumbersbyEvenANdOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<String, List<Integer>> collect = numbers.stream().collect(Collectors.groupingBy(x -> {
            if (x % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }));

        System.out.println(collect);
    }
}
