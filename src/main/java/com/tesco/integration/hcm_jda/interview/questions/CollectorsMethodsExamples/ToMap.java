package com.tesco.integration.hcm_jda.interview.questions.CollectorsMethodsExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ramu", "Sita", "Gita");

        Map<String, String> collect = names.stream().collect(Collectors.toMap(x -> x, x -> x));
        Map<Integer, String> collect1 = names.stream().collect(Collectors.toMap(x -> x.length(), x -> x));
        Map<String, String> collect2 = names.stream().collect(Collectors.toMap(x -> x, x -> x, (a, b) -> a));



    }
}
