package com.tesco.integration.hcm_jda.faang.arrays;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Step 1: skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: count length of last word
        while (i >= 0 && s.charAt(i) !=' ') {
            length++;
            i--;


        }

        return length;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));             // 5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); // 4
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}
