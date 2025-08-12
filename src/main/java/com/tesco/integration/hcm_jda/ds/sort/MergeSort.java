package com.tesco.integration.hcm_jda.ds.sort;

public class MergeSort {
    static int a[] = {34, 2, 89, 12, 7, 90, 987, 1000, 102, 1};

    public static void main(String[] args) {


        int lb = 0;
        int ub = a.length-1;
        for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
        }

        mergeSort(a, lb, ub);
        for(int i=0;i<a.length;i++){
           // System.out.println(a[i]);
            System.out.println("After sort"+a[i]);
        }


    }

    private static void mergeSort(int[] a, int lb, int ub) {

        if (lb < ub) { // to check whether two elements available
            int mid = (lb + ub) / 2;
            mergeSort(a, lb, mid);
            mergeSort(a, mid + 1, ub);
            mergeArray(a, lb, mid, ub);
        }

    }

    private static void mergeArray(int[] c, int lb, int mid, int ub) {

        int i = lb;
        int j = mid + 1;
        int k = lb;
int b[]=new int[a.length];

        while (i <= mid && j <= ub) {

            if (c[i] < c[j]) {
                a[k] = a[i];
                i++;
                k++;
            } else {
                a[k] = a[j];
                j++;
                k++;
            }
        }


        if (i > mid) {
            while (j <= ub) {
                a[k] = a[j];
                j++;
            }
        } else {
            while (i <= mid) {
                a[k] = a[i];
                i++;
            }
        }

    }

}