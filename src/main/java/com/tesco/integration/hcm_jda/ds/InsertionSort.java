package com.tesco.integration.hcm_jda.ds;

public class InsertionSort {

    public static void main(String[] args) {

        int a[]={9,2,89,8,7,6,65,4,3,21};

        for (int i=1;i<a.length;i++){
            int temp=a[i];
            int j=i-1;
            while(j>0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
        a[j+1]=temp;
        }

    }
}
