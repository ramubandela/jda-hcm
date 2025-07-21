package com.tesco.integration.hcm_jda.interview.questions;

import java.util.stream.IntStream;

public class ReverseStringInJava8 {

    public static void main(String[] args) {
        String str = "Hello World";

        IntStream.range(0, str.length())
                .map(i -> str.length() - 1 - i)  // Reverse index
                .mapToObj(str::charAt)
                .forEach(System.out::print);     // Output: dlroW olleH

    }
}
