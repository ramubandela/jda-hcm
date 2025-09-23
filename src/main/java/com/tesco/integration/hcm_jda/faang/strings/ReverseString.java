package com.tesco.integration.hcm_jda.faang.strings;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s="abbcvvghhhjjiii";
        char[] charArray = s.toCharArray();
        int start=0;
        int end=s.length()-1;

        while (start < end) {
            char temp = charArray[end];
            System.out.println(temp);
            charArray[end] = charArray[start];
            charArray[start] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(charArray));

    }
}
