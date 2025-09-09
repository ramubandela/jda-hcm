package com.tesco.integration.hcm_jda.interview.questions.optionalexample;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> opt = Optional.of("Hello");
        opt.ifPresent(x->System.out.println(x));

        Optional<String> emptyOpt = Optional.empty();

        System.out.println(emptyOpt.isPresent());  // false
        System.out.println(emptyOpt.orElse("Default"));  // Default

        String name = null;
        Optional<String> opt2 = Optional.ofNullable(name);

        System.out.println(opt2.isEmpty());  // true
        System.out.println(opt2.orElse("Guest"));  // Guest


    }
}
