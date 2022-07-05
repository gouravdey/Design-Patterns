package com.gd.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Test serialization issue
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/tarunsant/Documents/Tutorial/Java/Design-Patterns/dateUtil.ser"));
        oos.writeObject(singleton1);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/tarunsant/Documents/Tutorial/Java/Design-Patterns/dateUtil.ser"));
        Object singleton3 = ois.readObject();

        // Test Reflection Problem
        Singleton singleton4 = null;
        Constructor<?>[] declaredConstructors = Singleton.class.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
            try {
                singleton4 = (Singleton) constructor.newInstance();
                break;
            } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        // Solving reflection problem with enums
        SingletonEnum singletonEnum1  = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
        singletonEnum1.setName("Gourav");
        System.out.println(singletonEnum1.getName());
        System.out.println(singletonEnum2.getName());
        System.out.println();

        // Singleton Holder
        SingletonHolder singletonHolder1 = SingletonHolder.getInstance();
        SingletonHolder singletonHolder2 = SingletonHolder.getInstance();
        SingletonHolder singletonHolder3 = SingletonHolder.getInstance();
        System.out.println();

        // Printing Hashcode
        System.out.println("singleton1 = " + singleton1.hashCode());
        System.out.println("singleton2 = " + singleton2.hashCode());
        System.out.println("singleton3 = " + singleton3.hashCode());
        System.out.println("singleton4 = " + singleton4.hashCode());
        System.out.println("singletonEnum1 = " + singletonEnum1.hashCode());
        System.out.println("singletonEnum2 = " + singletonEnum2.hashCode());
        System.out.println("singletonHolder1 = " + singletonHolder1.hashCode());
        System.out.println("singletonHolder2 = " + singletonHolder2.hashCode());
        System.out.println("singletonHolder3 = " + singletonHolder3.hashCode());
        System.out.println();

        // Compare instances
        System.out.print("singleton1 == singleton2 :: ");
        System.out.println(singleton1 == singleton2);
        System.out.print("singleton1 == singleton3 :: ");
        System.out.println(singleton1 == singleton3);
        System.out.print("singleton1 == singleton4 :: ");
        System.out.println(singleton1 == singleton4);
        System.out.print("singletonEnum1 == singletonEnum2 :: ");
        System.out.println(singletonEnum1 == singletonEnum2);
        System.out.print("singletonHolder1 == singletonHolder2 :: ");
        System.out.println(singletonHolder1 == singletonHolder2);
        System.out.print("singletonHolder1 == singletonHolder3 :: ");
        System.out.println(singletonHolder1 == singletonHolder3);
    }
}
