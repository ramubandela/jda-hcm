package com.tesco.integration.hcm_jda.interview.questions;

public class StaticFlow {

    static  int x=10;

    static {
        System.out.println("x value is"+x);
        x=20;
    }
    static {

        System.out.println("x value is"+x);
    }
    public static void main(String[] args) {

    }

}
