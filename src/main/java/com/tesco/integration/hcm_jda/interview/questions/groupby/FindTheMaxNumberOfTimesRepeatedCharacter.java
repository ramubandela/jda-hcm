package com.tesco.integration.hcm_jda.interview.questions.groupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindTheMaxNumberOfTimesRepeatedCharacter {

    public static void main(String[] args) {

        String ss="helloramuhowareyou, ihopeyouaredoinggreate";
        Map<Character, Long> collect = ss.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x,Collectors.counting()));
        System.out.println(collect);

        collect.entrySet().stream().sorted(Map.Entry.comparingByValue()).limit(1).findFirst();

    }

}
