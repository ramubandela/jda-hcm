package com.tesco.integration.hcm_jda.interview.questions.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CombineTwoAsyncTasks {
    public static void main(String[] args) {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 20);
        CompletableFuture<Integer> integerCompletableFuture = future1.thenCombine(future2, (a, b) -> a + b);
        System.out.println(integerCompletableFuture.join());

    }

}
