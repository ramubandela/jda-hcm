package com.tesco.integration.hcm_jda.interview.questions.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ReduceExamples {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 6, 8, 9, 10);
        Integer reduce = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);


        Optional<Integer> reduce1 = list.stream().reduce((a, b) -> a + b);
        System.out.println(reduce1.get());

        Optional<Integer> reduce2 = list.stream().reduce(Integer::max);
        System.out.println(reduce2.get());

        Optional<Integer> reduce3 = list.stream().reduce(Integer::min);
        System.out.println(reduce3.get());

        Long collect = list.stream().collect(Collectors.counting());
        System.out.println(collect);

        int sum = list.stream().mapToInt(x -> x.intValue()).sum();
        System.out.println(sum+"sum");

        OptionalInt max = list.stream().mapToInt(x -> x.intValue()).max();
        System.out.println(max.getAsInt()+"sum");

    }
}
