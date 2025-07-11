package com.tesco.integration.hcm_jda.interview.questions;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    String s=new String();

    // Volatile for safe double-checked locking
    private static volatile Singleton instance;

    // Private constructor
    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() instead of reflection");
        }
    }

    // Thread-safe, lazy-loaded singleton with double-checked locking
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Prevents object duplication during deserialization
    protected Object readResolve() {
        return getInstance();
    }

    // Prevents cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning not allowed for singleton");
    }
}

