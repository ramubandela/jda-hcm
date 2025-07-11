package com.tesco.integration.hcm_jda.interview.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";

        Map<Character, Long> collect = inputString.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(collect+"collect..");




    }
}
