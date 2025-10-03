package com.tesco.integration.hcm_jda.faang.arrays;

public class BestTimeToBuyStock {
    public static void main(String[] args) {

        int a[]={7,1,6,8,9,0};

        int left=0;
        int profit=0;

        for(int right=1;right<a.length;right++){
            if(a[right]>a[left]){
                profit=Math.max(profit,a[right]-a[left]);
            }else{
                left=right;
            }
        }
System.out.println("max profit"+profit);
    }
}
