package com.tesco.integration.hcm_jda.ds.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[]={3,2,8,9,7,5,1};

        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){   // once the element sorted not that position we need to exclude it
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
