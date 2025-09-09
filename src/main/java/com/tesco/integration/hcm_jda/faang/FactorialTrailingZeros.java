package com.tesco.integration.hcm_jda.faang;

public class FactorialTrailingZeros {
// Number of zeros in the factorial
    public static void main(String[] args) {

        int a=100;
        int zeros=0;

        while(a>0){
        a=a/5;
        zeros=zeros+a;
        }

        System.out.println(zeros);

    }
}
