package com.tesco.integration.hcm_jda.interview.questions.groupby;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindTheMaxNumberOfTimesRepeatedCharacter {

    public static void main(String[] args) {

        String ss="helloramuhowareyou, ihopeyouaredoinggreate";
        Map<Character, Long> collect = ss.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x,Collectors.counting()));
       // System.out.println(collect);

        Optional<Map.Entry<Character, Long>> first = collect.entrySet().stream().sorted((e1,e2)->e2.getValue().compareTo(e1.getValue())).limit(1).findFirst();
        System.out.println(first.get().getKey()+"  "+first.get().getValue());

    }

}
