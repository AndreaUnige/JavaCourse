package classes;

import interfaces.IPrintable;

public class Cat implements IPrintable {

    public String name;
    public int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean olderThanSeven() { return age > 7;}

    @Override
    public void print() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "This is cat " + name;
    }
}
