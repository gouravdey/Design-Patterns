package com.gd.creational.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
        s1.move(5, 8);
        s1.attack();
        System.out.println("s1: " + s1);

        Swordsman s2 = (Swordsman) s1.clone();
        System.out.println("s2: " + s2);

        General g1 = new General();
        g1.move(2, 10);
        g1.boostMorale();
        System.out.println("g1: " + g1);

        General g2 = (General) g1.clone();
        System.out.println("g2: " + g2);
    }
}
