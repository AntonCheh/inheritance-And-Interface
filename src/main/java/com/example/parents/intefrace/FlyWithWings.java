package com.example.parents.intefrace;

import com.example.parents.FlyBehavior;

public interface FlyWithWings extends FlyBehavior {
    @Override
    default void fly() {
        System.out.println("I can fly with wings");;
    }
}
