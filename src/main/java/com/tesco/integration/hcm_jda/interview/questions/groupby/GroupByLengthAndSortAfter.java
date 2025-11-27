package com.tesco.integration.hcm_jda.interview.questions.groupby;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLengthAndSortAfter {
    public static void main(String[] args) {

        /*String s="abcbcdbcd";
        LinkedHashMap<Character, Character> map = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.collectingAndThen(
                Collectors.toList(),
                tolIst -> tolIst.stream().filter(x -> x == 1).findFirst().orElse('$')
        )));

        System.out.println(map);*/

     //   List.of

        List<String> hello = List.of("hello", "ramu1", "hi", "ab", "eff", "aff");

        Map<Integer, List<String>> collect = hello.stream().collect(Collectors.groupingBy(String::length, Collectors.collectingAndThen(Collectors.toList(), toList -> toList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()))));
        System.out.println(collect+"collect");

    }
}
