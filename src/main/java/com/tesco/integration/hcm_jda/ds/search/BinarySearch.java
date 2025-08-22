package com.tesco.integration.hcm_jda.ds.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8};

         int find=7;

        int low=0;
        int high=a.length-1;

        while(low<=high){


            int mid=(low+high)/2;
            if(a[mid]==find){
                System.out.println("value find at "+mid);
            }

            if(find>a[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }


        }
    }
}
