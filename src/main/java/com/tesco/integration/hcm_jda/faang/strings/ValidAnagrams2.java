package com.tesco.integration.hcm_jda.faang.strings;

public class ValidAnagrams2 {
    public static void main(String[] args) {
        String s="hellohowareyou";
        String t="hellohowareyou";

        if(s==null && t==null){
            System.out.println("given strings are not Anagram");
            return;
        }
        if(s.length() !=t.length()){
            System.out.println("given strings are not Anagram");
            return;
        }

        int frequency[]=new int[26];

        for(int i=0;i<s.length();i++){
            frequency[s.charAt(i)-'a']++;
            frequency[t.charAt(i)-'a']--;
        }


        for(int i=0;i<s.length();i++){
            if(frequency[s.charAt(i)-'a'] !=0 ){
                System.out.println("given strings are not Anagram");
                return;
            }else{
                System.out.println("given string is Anagram");
                return;
            }

        }
    }
}
