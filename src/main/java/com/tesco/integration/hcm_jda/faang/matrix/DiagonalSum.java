package com.tesco.integration.hcm_jda.faang.matrix;

public class DiagonalSum {
    public static void main(String[] args) {

        int arr[][]={{1,2,3},{1,2,3},{1,2,3}};
        int sum=0;

        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j && i+j==n-1){
                    sum=sum+arr[i][j];
                } else if (i==j) {
                    sum=sum+arr[i][j];
                } else if (i+j==n-1) {
                    sum=sum+arr[i][j];
                }
            }
        }

System.out.println("sum"+sum);
    }
}
