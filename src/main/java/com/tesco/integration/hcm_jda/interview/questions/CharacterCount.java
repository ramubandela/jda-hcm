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

        String inputString2 = "Java Concept Of The Day";

        inputString2.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x,Collectors.counting()));

        String ss="programming";
        String out="";
        for(int i=0;i<ss.length();i++){
            if(out.contains(((Character)ss.charAt(i)).toString())){

            }else{
                out=out+ss.charAt(i);
            }
        }

        System.out.println(out+"out");
    }
}
