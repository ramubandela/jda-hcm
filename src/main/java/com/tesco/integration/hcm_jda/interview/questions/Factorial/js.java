package com.tesco.integration.hcm_jda.interview.questions.Factorial;

public class js {
    public static void main(String[] args) {

        System.out.println(multiply(4));
    }

    public static   int multiply(int n){
        if(n<=0){
            return 1;
        }

        return n*multiply(n-1);

    }
}
