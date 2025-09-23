package com.tesco.integration.hcm_jda.faang.strings;

import java.util.*;
import java.util.stream.Collectors;

public class ValidAnagram {
    public static void main(String[] args) {

        String s1="ramudxcvbd";
        String s2="ramucvbdvb12";


        Map<Character,Integer> hm1=new HashMap<>();
        Map<Character,Integer> hm2=new HashMap<>();

        Map<Character, Long> collect = s1.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        Map<Character, Long> collect2 = s2.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        LinkedHashMap<Character, Long> collect1 = s1.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect1+"collect1");

        Set<Map.Entry<Character, Long>> entries = collect.entrySet();
        boolean isAnagram=false;
       for(int i=0;i<s1.length();i++){

          if(collect.get(s1.charAt(i)) ==collect.get(s2.charAt(i)) ){
              isAnagram=true;
          }else{
              isAnagram=false;
          }
       }

       System.out.println(isAnagram+"isAnagram");
    }
}
