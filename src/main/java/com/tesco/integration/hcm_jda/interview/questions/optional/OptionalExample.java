package com.tesco.integration.hcm_jda.interview.questions.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

       // Optional<Object> o = Optional.of(null);
       // System.out.println(o.isPresent());   NullPointer Exception
     /*   Optional<Object> empty = Optional.empty();
        System.out.println(empty.get());*/


        // ofNullable

        String value = null;
        Optional<String> opt = Optional.ofNullable(value);

        opt.ifPresent(System.out::println); // prints nothing (no NPE)


        String result = opt.orElse("Default Value");
        System.out.println(result); // Output: Default Value




        String result3 = opt.orElseGet(() -> getFromDatabase());
        System.out.println(result3);




        Optional<String> ramu = Optional.ofNullable("ramu");
        System.out.println(ramu.isPresent());

        Optional<String> ramu1 = Optional.ofNullable(null);
        System.out.println(ramu1.isPresent());

        //Optional.of(null);

        Optional<String> o = Optional.of("ramu");
        System.out.println(o.isPresent()+"of");

        /*Optional<String> o1= Optional.of(null);
        System.out.println(o1.get());*/  // Gives NullPointer Exception

// Optional.empty()
//You use it when you want to return “no value” instead of returning null

        Optional<Object> empty = Optional.empty();
        System.out.println(empty.isPresent()+"empty");

        Optional<String> result4 = Optional.of("Java")
                .filter(s -> s.startsWith("P"))
                .or(() -> Optional.empty()); // returns empty if condition fails



    }

    private static String getFromDatabase() {
        System.out.println("Fetching from DB...");
        return "DB Value";
    }
}
