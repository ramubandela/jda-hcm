package com.tesco.integration.hcm_jda.interview.questions;

import java.util.*;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day";

        LinkedHashMap<String, Long> collect = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()));

        String value = collect.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();

        System.out.println("value"+value);

        Set<Integer> uniqueElements = new HashSet<>();
        uniqueElements.add(1);
    }
}
