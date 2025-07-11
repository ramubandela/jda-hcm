package com.tesco.integration.hcm_jda.interview.questions;

public class ThreadExample extends  Thread{
    @Override
    public void run() {
        for(int i=0;i<=10;i++){

            System.out.println("Child thread "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadExample t=new ThreadExample();
        t.start();
        t.join();


    }
}
