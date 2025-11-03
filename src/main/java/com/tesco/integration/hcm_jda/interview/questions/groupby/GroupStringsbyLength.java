package com.tesco.integration.hcm_jda.interview.questions.groupby;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsbyLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "java","jr ntr", "stream", "api", "map");

//Just grouping
        Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);

// After grouping sort them in reverse alphabetical order

        Map<Integer, List<String>> collect2 = words.stream().collect(Collectors.groupingBy(String::length,Collectors.collectingAndThen(Collectors.toList(),toList->toList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()))));
        System.out.println(collect2);

// After groupIng send only one character.
        Map<Integer, List<Character>> collect3 = words.stream().collect(Collectors.groupingBy(String::length, Collectors.collectingAndThen(Collectors.toList(), tolIst -> tolIst.stream().map(x -> x.charAt(0)).collect(Collectors.toList()))));
        System.out.println(collect3);




    }
}
