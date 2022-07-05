package com.gd.creational.singleton;

public class SingletonHolder {

    private SingletonHolder() {
        System.out.println("Inside SingletonHolder constructor!");
    }

    private static class SingletonHolderInner {
        static SingletonHolder instance = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return SingletonHolderInner.instance;
    }
}
