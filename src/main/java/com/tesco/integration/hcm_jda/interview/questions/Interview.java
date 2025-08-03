package com.tesco.integration.hcm_jda.interview.questions;

import java.util.*;
import java.util.stream.Collectors;

public class Interview {
    public static void main(String[] args) {


        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> collect = listOfIntegers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(collect+"collect");

        collect.forEach((x,y)->{System.out.println(x+"  "+y);});


        Map<Integer,String> hm=new HashMap<>();
        hm.put(1, "one");
        hm.put(2,"two");
        hm.put(3,"three");

        hm.forEach((x,y)->System.out.println(x+"  "+y));

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        Set<String> ss=new HashSet<>();
        listOfStrings.stream().map(x->ss.add(x)).collect(Collectors.toList());
        System.out.println(ss+"ss");


        String inputString = "Java Concept Of The Day";
        Map<Character, Long> collect1 = inputString.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(collect1+"collect1");

        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> collect2 = stationeryList.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(collect2+"collect2");

        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<Double> collect3 = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(collect3+"collect3");

        List<String> listOfStrings2 = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String collect4 = listOfStrings2.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println("collect4"+collect4);

        int i=432211;
        String s = String.valueOf(i);
        System.out.println("s"+s);
        Integer collect5 = Arrays.stream(s.split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println("collect5   "+collect5);


        List<Integer> listOfIntegers2 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Integer integer = listOfIntegers2.stream().max(Comparator.naturalOrder()).get();

        System.out.println("Max integer"+integer);


    }
}
