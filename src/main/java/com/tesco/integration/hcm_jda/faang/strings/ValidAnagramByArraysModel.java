package com.tesco.integration.hcm_jda.faang.strings;

public class ValidAnagramByArraysModel {
    public static void main(String[] args) {

        String s1="ramu";
        String s2="ramu";

        if(s1.length() ==s2.length()){

            int count[]=new int[26];

            for(int i=0;i<s1.length();i++){

                System.out.println(s1.charAt(i) - 'a');
               count[s1.charAt(i) - 'a']++;
                count[s2.charAt(i)-'a']--;
            }

            for(int i=0;i<count.length;i++){
                if(count[i] !=0){
                    System.out.println("is not a valid anagram");
                    return;
                }else{
                    System.out.println("is  a valid anagram");
                }
            }
        }else{
            System.out.println("s1 and s2 are anagrams");
        }

    }
}
