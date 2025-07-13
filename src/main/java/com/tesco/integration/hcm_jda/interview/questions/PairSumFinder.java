package com.tesco.integration.hcm_jda.interview.questions;

import java.util.HashSet;

public class PairSumFinder {

    public static void findPairsWithSum(int[] arr, int targetSum) {
        HashSet<Integer> seen = new HashSet<>();

        System.out.println("Pairs with sum " + targetSum + ":");

        for (int num : arr) {
            int complement = targetSum - num;
            if (seen.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            seen.add(num);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 3, 5, 7, 8, -1, 9};
        int target = 10;

        findPairsWithSum(numbers, target);
    }
}