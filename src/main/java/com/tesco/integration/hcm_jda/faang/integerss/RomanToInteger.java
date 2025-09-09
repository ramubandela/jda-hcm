package com.tesco.integration.hcm_jda.faang.integerss;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        // Step 1: Store Roman values
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));
            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                total -= value;
            } else {
                total += value;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));    // 3
        System.out.println(romanToInt("IV"));     // 4
        System.out.println(romanToInt("IX"));     // 9
        System.out.println(romanToInt("LVIII"));  // 58  (L=50 + V=5 + III=3)
        System.out.println(romanToInt("MCMXCIV"));// 1994 (M=1000 + CM=900 + XC=90 + IV=4)
    }
}
