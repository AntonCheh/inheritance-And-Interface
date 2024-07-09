package com.example.parents;

public abstract class Duck   {

    public QuackBehavior quackBehavior;
    public FlyBehavior flyBehavior;

    public Duck(){
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks swim even decoys");
    };









}
