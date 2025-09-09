package com.tesco.integration.hcm_jda.faang.strings;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String arr[]={"follower", "follow","folw"};

        String prefix=arr[0];

        for(int i=1;i<arr.length;i++){

            while(arr[i].indexOf(prefix) !=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.println("Prefix......."+prefix);

    }
}
