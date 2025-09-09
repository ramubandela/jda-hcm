package com.tesco.integration.hcm_jda.ds.sort;

import java.util.Arrays;

public class MergeSort2 {

    public static void main(String[] args) {

        int arr[] = {200, 8972, 7, 100, 87, 1, 0};
        int li = 0;
        int ri = arr.length - 1;

        divideArray(arr, li, ri);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }

    private static void divideArray(int[] arr, int li, int ri) {
        int mid = (li + ri) / 2;
        if (li < ri) {
            divideArray(arr, li, mid);
            divideArray(arr, mid + 1, ri);
            mergeArray(arr, li, mid, ri);
        }
    }

    private static void mergeArray(int arr[], int li, int mid, int ri) {

        int mergedArray[] = new int[ri-li + 1];

        int i = li;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ri) {
            if (arr[i] < arr[j]) {
                mergedArray[k] = arr[i];
                k++;
                i++;
            } else {
                mergedArray[k] = arr[j];
                k++;
                j++;
            }
        }

        if (i > mid) {
            while (j <= ri) {
                mergedArray[k] = arr[j];
                k++;
                j++;
            }
        } else {
            while (i <= mid) {
                mergedArray[k] = arr[i];
                k++;
                i++;
            }


        }

        for(int m=li;m<mergedArray.length;m++){
            arr[m] = mergedArray[m];        }

    }
}
