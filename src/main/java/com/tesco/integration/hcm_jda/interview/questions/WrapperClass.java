package com.tesco.integration.hcm_jda.interview.questions;

public class WrapperClass {
    public static void main(String[] args) {

        //AutoBoxing

        Integer i1=10;
        System.out.println(i1);

        //int i2=new Integer(20);  AutoUnboxing

        //Integer a1=new Integer(10);// new Integer() deprecated

        Integer a1=Integer.valueOf(10);
        Integer a2=Integer.valueOf(10);

        System.out.println(a1==a2);
        //Because Java uses Integer Cache for values -128 to +127.

        //Except float and double values all values will be cached

    }
}
