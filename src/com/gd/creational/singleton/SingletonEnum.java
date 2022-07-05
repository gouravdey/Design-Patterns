package com.gd.creational.singleton;

public enum SingletonEnum {
    INSTANCE;

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
