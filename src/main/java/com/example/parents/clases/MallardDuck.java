package com.example.parents.clases;

import com.example.parents.Duck;
import com.example.parents.FlyBehavior;
import com.example.parents.QuackBehavior;
import com.example.parents.intefrace.FlyWithWings;
import com.example.parents.intefrace.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack(){};
        flyBehavior = new FlyWithWings(){};
    }

    @Override
    public void swim() {

    }

    @Override
    public void display() {

    }
}
