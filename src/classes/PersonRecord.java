package classes;

public record PersonRecord(String name, int age) {

    public static final String DEFAULT_NAME = "John Doe";

    // Override del costruttore
    /*
    public PersonRecord(String name, int age) {
        if (age < 0)
            throw  new IllegalArgumentException("Age cannot be negative");

        this.name = name;
        this.age = age;
    }
    */

    // Costruttore "compatto"
    public PersonRecord {
        if (age < 0)
            throw  new IllegalArgumentException("Age cannot be negative");
    }


    public String nameInUpperCase() {
        return name.toUpperCase();
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }
}
