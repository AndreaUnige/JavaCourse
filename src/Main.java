import classes.MyDBConnector;
import classes.Persona;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyDBConnector myConnector = new MyDBConnector();

        Persona p = new Persona(myConnector);
        ArrayList<Persona> people = p.getAll();
        people
                .forEach(singlePerson -> System.out.println(singlePerson.toString()));


        System.out.println("\n\n\n");
        System.out.println(p.get(1).toString());

    }
}