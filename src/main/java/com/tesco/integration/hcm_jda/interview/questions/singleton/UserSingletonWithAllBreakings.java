package com.tesco.integration.hcm_jda.interview.questions.singleton;

import java.io.Serializable;

public class UserSingletonWithAllBreakings  implements Serializable, Cloneable {

    private static UserSingletonWithAllBreakings instance;

     // Single User object

    // Private constructor
    private UserSingletonWithAllBreakings() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance");
        }
    }

    // Lazy initialization, thread-safe
    public static synchronized UserSingletonWithAllBreakings getInstance() {
        if (instance == null) {
            synchronized (UserSingletonWithAllBreakings.class) {
                if(instance == null) {
                    instance = new UserSingletonWithAllBreakings();
                }
            }
        }
        return instance;
    }

    // Set User (only if not already created)


    // Get User

    // Prevent cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton cannot be cloned");
    }

    // Prevent serialization from creating new instance
    protected Object readResolve()   {
        return getInstance();
    }
}
