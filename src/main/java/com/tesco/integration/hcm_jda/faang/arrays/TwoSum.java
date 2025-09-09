package com.tesco.integration.hcm_jda.faang.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        String s1="abc";
        String s2=s1;
        s2=s2.concat("d");

        System.out.println(s1);

        System.out.println(s2);

        System.out.println(s1==s2);

        int a[]={1,9,3,7,0,5,8,20};
        int target=28;

        Map<Integer, Integer> hm=new HashMap<>();

        for(int i=0;i<a.length;i++){
             int diff=target-a[i];

             if(hm.containsKey(diff)){
                int x=target-a[i];
                System.out.println("pair found at "+a[i]+" "+x);
            break;
            }else{
                hm.put(a[i],i);
            }
        }

    }
}
