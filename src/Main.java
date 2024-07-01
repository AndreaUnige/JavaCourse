import classes.Person;
import classes.PersonRecord;

public class Main {
    public static void main(String[] args) {

        // Standard constructor
        Person persona = new Person("Andrea", 40);
        System.out.println(persona.getName());

        PersonRecord personRecord = new PersonRecord("Andrea", 40);
        System.out.println(personRecord.name());

        // Equal
        System.out.println(persona.equals(new Person("Andrea", 40)));
        System.out.println(personRecord.equals(new PersonRecord("Andrea", 40)));

        // toString
        System.out.println(persona);
        System.out.println(personRecord);

        System.out.println(persona.nameInUpperCase());
        System.out.println(personRecord.nameInUpperCase());

        Person.sayHello();
        PersonRecord.sayHello();
    }
}