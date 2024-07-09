package com.example.parents.intefrace;

import com.example.parents.QuackBehavior;

public interface MuteQuack extends QuackBehavior {
    @Override
    default void quack() {
        System.out.println("Silence");;
    }
}
