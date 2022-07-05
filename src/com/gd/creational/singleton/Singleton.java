package com.gd.creational.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    // The field must be declared volatile so that double check lock would work correctly.
    private static volatile Singleton instance;

     /*
     // Eager initialization
     private static DateUtil instance = new DateUtil();

     // Static initialization
     static {
        instance = new DateUtil();
     }
    */

    private Singleton() {}

    public static Singleton getInstance() {

        // Double-checked locking (DCL). It exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate instances as a result.
        if (instance == null) {
            synchronized (Singleton.class) {
                // Lazy initialization
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    // Handle Serialization-Deserialization issue
    protected Object readResolve() {
        return instance;
    }

    // Handle Cloning issue
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
