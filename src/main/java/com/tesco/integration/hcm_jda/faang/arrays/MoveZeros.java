package com.tesco.integration.hcm_jda.faang.arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums={8,7,9,6,0,0,1,0,2,3};
        int index=0;

        for(int ii:nums){
            if(ii !=0 ){
                nums[index]=ii;
                index++;
            }
        }
        while(index< nums.length){
            nums[index]=0;
            index++;
        }

        System.out.println(Arrays.toString(nums));
    }
}
