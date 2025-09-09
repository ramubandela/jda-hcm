package com.tesco.integration.hcm_jda.interview.questions;

public class InstanceFlow {

    int a = 10; // instance variable

    // Instance block 1
    {
        System.out.println("Instance block 1: a = " + a);
        a = 20;
    }

    // Instance block 2
    {
        System.out.println("Instance block 2: a = " + a);
    }

    // Constructor
    InstanceFlow() {
        System.out.println("Constructor: a = " + a);
    }

    public static void main(String[] args) {
        new InstanceFlow(); // creating first object
        new InstanceFlow(); // creating second object
    }
}
