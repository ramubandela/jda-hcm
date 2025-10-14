package com.tesco.integration.hcm_jda.interview.questions.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ExceptionHandling {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(()-> {throw new RuntimeException("Error occured");}).exceptionally(ex->{
                System.out.println(ex.getMessage());
                return 0;
                }
                );
    }
}
