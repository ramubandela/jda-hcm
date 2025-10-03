package com.tesco.integration.hcm_jda.faang.arrays;

import java.util.Arrays;

public class RansomeNote {
    public static void main(String[] args) {
        int[] frequency=new int[26];
        String magazine="world";
        String ransomeNote="helloworld";
        String isRansome="yes";

        for(int i=0;i<ransomeNote.length()-1;i++){
            frequency[ransomeNote.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(frequency));

        for(int i=0;i<magazine.length()-1;i++){

            if(frequency[magazine.charAt(i)-'a']==0){
                System.out.println("isnot a ransome note");
                isRansome="Nope";
            }
            frequency[magazine.charAt(i)-'a']--;
        }
        System.out.println(isRansome);
    }
}
