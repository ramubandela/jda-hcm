package com.tesco.integration.hcm_jda.interview.questions.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

       // Optional<Object> o = Optional.of(null);
       // System.out.println(o.isPresent());   NullPointer Exception
     /*   Optional<Object> empty = Optional.empty();
        System.out.println(empty.get());*/

        Optional<String> ramu = Optional.ofNullable("ramu");
        System.out.println(ramu.isPresent());   

    }
}
