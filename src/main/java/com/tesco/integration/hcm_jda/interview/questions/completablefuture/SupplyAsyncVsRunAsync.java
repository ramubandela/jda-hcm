package com.tesco.integration.hcm_jda.interview.questions.completablefuture;

import java.util.concurrent.CompletableFuture;

public class SupplyAsyncVsRunAsync {
    public static void main(String[] args) {

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(() -> {
            System.out.println("Running async task...");
        });

        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
            return "Result from async task";
        });

        voidCompletableFuture.join();
        System.out.println(stringCompletableFuture.join());



    }
}
