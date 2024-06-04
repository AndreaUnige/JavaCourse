package com.andrea.interfaces;

public interface IAction {
    public void speak();
    public void jump();
    public default void run() {
        System.out.println("I run fast");
    }
}
