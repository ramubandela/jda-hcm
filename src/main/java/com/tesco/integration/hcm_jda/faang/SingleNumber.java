package com.tesco.integration.hcm_jda.faang;

public class SingleNumber {

    // input 2 2 1--> 1,  input 4 1 2 1 2  --> 4

    public static void main(String[] args) {

        int a[]={2,2,1};
        int singleNumber = findSingleNumber(a);

        System.out.println(singleNumber+"Single number");
    }

    public static int findSingleNumber(int a[]){


    int singleNumber=0;
        for(int i:a){

            singleNumber=singleNumber^i;
        }

        return singleNumber;

    }
}
