package com.tesco.integration.hcm_jda.interview.questions;

public class ReverseStringByRecursive {
    public static void main(String[] args) {

        System.out.println(reverse("happy"));
    }

    public static String reverse(String s){
        if(s.isEmpty()){
            return "";
        }

return s.substring(1)+s.charAt(0);
    }
}
