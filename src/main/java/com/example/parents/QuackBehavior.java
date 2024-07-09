package com.example.parents;

public interface QuackBehavior {
    public default void quack() {
        System.out.println("qua");
    }
}
