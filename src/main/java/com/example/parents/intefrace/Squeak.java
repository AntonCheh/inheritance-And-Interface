package com.example.parents.intefrace;

import com.example.parents.QuackBehavior;

public interface Squeak extends QuackBehavior {
    @Override
    default void quack() {
        System.out.println("squeak");;
    }
}
