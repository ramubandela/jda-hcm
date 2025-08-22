package com.tesco.integration.hcm_jda;

import java.util.Optional;

public class Practise {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        switch ( a){

            case 10: System.out.println("Hello 10");

        }

        int i = a > b ? 40 : 60;


        Optional<String> ramu = Optional.of("ramu");

        String hello = ramu.orElse("hello");
        System.out.println(hello+"hello");

        String s = ramu.orElseGet(() -> {
                    return "30";
                }
        );

        System.out.println(s+"s");

        for(int j=0;j<10;j++)
        {
            if(j%2==0){
                continue;
            }
            System.out.println(j+"j value");
        }

        }



}
