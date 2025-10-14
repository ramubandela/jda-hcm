package com.tesco.integration.hcm_jda.interview.questions.CollectorsMethodsExamples;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joining {
    public static void main(String[] args) {
        String joined = Stream.of("Java", "8", "Collectors")
                .collect(Collectors.joining(" - "));
        System.out.println(joined);

        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        nums.stream().collect(Collectors.summarizingInt(Integer::intValue));


    }
}
