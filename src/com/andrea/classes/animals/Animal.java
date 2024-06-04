package com.andrea.classes.animals;

public class Animal {
    private String name;
    private int eta;

    public Animal() {}

    public Animal(String name, int eta) {
        this.name = name;
        this.eta = eta;
    }

    public String toString() {
        return "Name: " + this.name +
                "\nEta: " + this.eta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}
