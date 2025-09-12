package com.tesco.integration.hcm_jda.ds.sort;

public class QuickSort1 {

public static int partition(int arr[],int low, int high){

    int i=low-1;
   int pivot=arr[high];

    for(int j=low;j<arr.length;j++){

        if(arr[j]<pivot){
            i++;
           int temp=arr[j];
           arr[j]=arr[i];
            arr[i]=temp;
        }
    }

    int temp=arr[high];
    arr[high]=arr[i+1];
    arr[i+1]=temp;
return i+1;
}


    public static void quickSort(int arr[],int low,int high){

        if(low<high){

            int pi = partition(arr, low, high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }

    }
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        quickSort(arr, 0, n - 1);

        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
