package com.tesco.integration.hcm_jda.faang.twopointers;

public class FindTarget {
    public static void main(String[] args) {

        int a[]={1,2,3,7,9,10,15};//Array is sorted need to find the target 10

        int target=22;
        int front=0;
        int rear=a.length-1;

        while(front<rear){

            if(a[front]+a[rear]==target){
                break;
            }else if(a[front]+a[rear]>target){
            rear--;
            }else{
                front++;
            }
        }
    }
}
