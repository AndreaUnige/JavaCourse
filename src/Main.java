import classes.Cat;
import interfaces.IPrintable;
import interfaces.IPrintableWithParams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        /*
        Cat myCat = new Cat("Fuffi", 2);
        // myCat.print();

        // printThing(myCat);

        IPrintable myPrintable = () -> System.out.println("Meow");
        printThing(myPrintable);

        String ss = printThingWithParams( (s) -> "Meow " + s );

        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running runnable");
            }
        };
        Thread thread = new Thread(myRunnable);
        thread.start();

        new Thread(() -> System.out.println("Running runnable")).start();
        */

        //////////////////////////////////////////////////////
        /////////////////// STREAMS \\\\\\\\\\\\\\\\\\\\\\\\\\\
        //////////////////////////////////////////////////////

//        IntStream // Source
//        .range(0, 10) // Intermediate op
//        .forEach( (i) -> System.out.println("Element: " + i) );

//        IntStream // Source
//        .range(0, 10) // Intermediate op
//        .skip(5) // Intermediate op
//        .forEach( (i) -> System.out.println("Element: " + i) );

//        double sum = IntStream
//        .range(0, 10)
//        .sum();
//        System.out.println(sum);

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Cat 1", 5);
        cats[1] = new Cat("Cat 2", 3);
        cats[2] = new Cat("Cat 3", 18);
        cats[3] = new Cat("Cat 4", 5);
        cats[4] = new Cat("Cat 5", 8);

//        Stream.of(cats) // Source
//        // .filter(Cat::olderThanSeven) // Intermediate
//        .filter(c -> c.age >= 10)
//        .forEach(System.out::println); // Terminal

//        Stream.of(cats)
//                .map(c -> new Cat("Name void", c.age++) )
//                .forEach(System.out::println);

        try {
            Files.lines(Paths.get("files/bands.txt")) // Source
                    .filter(singleBand -> singleBand.contains("Pi"))
                    .forEach(singleBand -> System.out.println(singleBand));
        } catch (IOException e) { throw new RuntimeException(e); }

        try {
            List<String> bands = Files.lines(Paths.get("files/bands.txt")) // Source
                    .filter(singleBand -> singleBand.contains("Pi"))
                    .collect(Collectors.toList());
        } catch (IOException e) { throw new RuntimeException(e); }

    }

    static void printThing(IPrintable printable) {
        printable.print();
    }

    static String printThingWithParams(IPrintableWithParams printableWithParams) {
        return printableWithParams.print("!!");
    }
}