package com.tesco.integration.hcm_jda.interview.questions.completablefuture;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class RealTimeExample {
    public static void main(String[] args) {
        List<Integer> empIds = List.of(1, 2, 3, 4);

        List<CompletableFuture<String>> futures = empIds.stream()
                .map(id -> CompletableFuture.supplyAsync(() -> getEmployeeDetails(id)))
                .collect(Collectors.toList());

// Wait for all to finish
        List<String> results = futures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        results.forEach(System.out::println);



    }
    private static String getEmployeeDetails(Integer id) {
        return "Employee-" + id;
    }
}
