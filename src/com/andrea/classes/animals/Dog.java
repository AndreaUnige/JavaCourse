package com.andrea.classes.animals;

import com.andrea.interfaces.IAction;
import com.andrea.interfaces.IResidency;

public class Dog extends Animal implements IResidency {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("The dog barks!");
    }

    @Override
    public void jump() {
        System.out.println("The dog jumps 0.5 meters!");
    }

    @Override
    public void residency() {
        System.out.println("I live free!");
    }

    @Override
    public void run() {
        System.out.println("Dogs run faster");
    }
}
