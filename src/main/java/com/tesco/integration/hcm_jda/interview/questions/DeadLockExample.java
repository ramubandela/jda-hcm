package com.tesco.integration.hcm_jda.interview.questions;

public class DeadLockExample {

    public static void main(String[] args) {
        String s1=new String("hello");
        String s2=new String("ramu");

       Runnable runnable=() -> {
           synchronized (s1){
               System.out.println(s2);
               synchronized (s2){
                   System.out.println(s1);
               } }  };

        Runnable runnable2=() -> {
            synchronized (s2){
                System.out.println(s1);
                synchronized (s1){
                    System.out.println(s2);
                } }  };

Thread t=new Thread(runnable);
Thread t2=new Thread(runnable2);
t.start();
t2.start();

    }
}
