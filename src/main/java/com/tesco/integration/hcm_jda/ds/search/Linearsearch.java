package com.tesco.integration.hcm_jda.ds.search;

public class Linearsearch {
    public static void main(String[] args) {

        int[] a={1,2,3,4,5,6,7,8};

        int find=7;

        for(int i=0;i<a.length;i++){
            if(a[i]==find){
                System.out.println(find+"value found at "+i);
                return;
            }
        }

    }
}
