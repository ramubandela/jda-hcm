package com.tesco.integration.hcm_jda.interview.questions.singleton;

public class Test {
    public static void main(String[] args) {
        UserSingleton.INSTANCE.setUser("Alice", 25);

        // Retrieve the same User object anywhere
        User user1 = UserSingleton.INSTANCE.getUser();
        System.out.println(user1);  // User{name='Alice', age=25}

        // Trying to set again won't create a new User
        UserSingleton.INSTANCE.setUser("Bob", 30);
        User user2 = UserSingleton.INSTANCE.getUser();
        System.out.println(user2);  // Still User{name='Alice', age=25}

        // Verify same object
        System.out.println(user1 == user2); // true
    }
}
