package com.example.parents;

public interface FlyBehavior {
    public default void fly() {
        System.out.println("Fly above the sky");
    }
}
