package com.example.parents.intefrace;

import com.example.parents.FlyBehavior;

public interface FlyNoWay extends FlyBehavior {
    @Override
    default void fly() {
        System.out.println("I can't fly");
    }
}
