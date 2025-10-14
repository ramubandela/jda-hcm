package com.tesco.integration.hcm_jda.interview.questions.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletebleTransform {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(()->2).thenApply(x->x*2).thenAccept(x->System.out.println(x))
                .thenRun(()->System.out.println("Task completed..."));
    }
}
