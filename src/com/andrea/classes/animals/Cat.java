package com.andrea.classes.animals;

import com.andrea.interfaces.IAction;
import com.andrea.interfaces.IResidency;

public class Cat extends Animal implements IAction, IResidency {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("The cat says Meow");
    }

    @Override
    public void jump() {
        System.out.println("The cat jumps 1 meters");
    }

    @Override
    public void residency() {
        System.out.println("I live in the cage 2");
    }
}
