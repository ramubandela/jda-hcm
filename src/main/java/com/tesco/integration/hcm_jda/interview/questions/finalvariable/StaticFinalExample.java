package com.tesco.integration.hcm_jda.interview.questions.finalvariable;

public class StaticFinalExample {

    static  final int x;


    static {
        x=20;
    }

    public static void main(String[] args) {
        StaticFinalExample staticFinalExample=new StaticFinalExample();
        System.out.println(x);

    }
}
