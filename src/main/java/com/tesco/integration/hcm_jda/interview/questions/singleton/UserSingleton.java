package com.tesco.integration.hcm_jda.interview.questions.singleton;

public enum  UserSingleton {
    INSTANCE;  // Single enum instance

    private User user;  // Single User object

    // Method to create/set User
    public void setUser(String name, int age) {
        if (user == null) {   // ensure only one User object is created
            user = new User(name, age);
        }
    }

    // Method to get the User object
    public User getUser() {
        return user;
    }
}

 class User {
    private String name;
    private int age;

    // Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}