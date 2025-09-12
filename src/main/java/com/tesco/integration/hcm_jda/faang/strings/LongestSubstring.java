package com.tesco.integration.hcm_jda.faang.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        String s="bbbbbbbbbbb";


        List<Character> list=new ArrayList<>();

        int low=0;
        int maxLength=0;

        for(int high=0;high<s.length();high++){
            if(!list.contains(s.charAt(high))){
            list.add(s.charAt(high));
                maxLength=Integer.max(maxLength,list.size());
            }else{
                list.remove(Character.valueOf(s.charAt(low)));
               low++;
            }
        }
        System.out.println(maxLength);
    }
}
