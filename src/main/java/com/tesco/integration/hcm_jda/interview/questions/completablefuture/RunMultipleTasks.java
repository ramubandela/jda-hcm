package com.tesco.integration.hcm_jda.interview.questions.completablefuture;

import java.util.concurrent.CompletableFuture;

public class RunMultipleTasks {
    public static void main(String[] args) {
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> "Task1");
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> "Task2");
        CompletableFuture<String> f3 = CompletableFuture.supplyAsync(() -> "Task3");

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(f1, f2, f3);
       System.out.println( voidCompletableFuture.join());

    }
}
