package com.tesco.integration.hcm_jda.faang.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static void main(String[] args) {

        int[] arr={3,4,8,9,1,2,4};
        Set<Integer> set=new HashSet<>();
for(int ii:arr){
if(set.contains(ii)){
    System.out.println("array contains duplicates");
    break;
}else{
    set.add(ii);
    }
}

    }
}
