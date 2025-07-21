package com.tesco.integration.hcm_jda.interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord {



    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        List<StringBuffer> collect = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.toList());
         System.out.println(collect+"collect");
    }

}
