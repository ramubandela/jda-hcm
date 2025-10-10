package com.tesco.integration.hcm_jda.interview.questions.goldmansachs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByAgeButOnlyNamesDisplay {
    public static void main(String[] args) {

        List<Empployee> list = Arrays.asList(
                new Empployee(2, "raja", "", 25),
                new Empployee(3, "raj", "", 25),
                new Empployee(5, "ramu", "", 30),
                new Empployee(6, "rama", "", 30),
                new Empployee(8, "ramana", "", 45),
                new Empployee(90, "venu", "", 45),
                new Empployee(678, "veena", "", 90),
                new Empployee(2, "veen", "", 90),
                new Empployee(2, "ven", "", 90)
        );
        Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(Empployee::getAge, Collectors.mapping(Empployee::getName, Collectors.toList())));
    System.out.println(collect+"collect");

    }
}
