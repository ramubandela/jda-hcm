package com.tesco.integration.hcm_jda.interview.questions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("ab");
        Matcher matcher = pattern.matcher("abcabcabababcrgdtababc");

        while(matcher.find()){
            System.out.println(matcher.start()+" "+ matcher.end()+" "+ matcher.group());
        }


    }
}
