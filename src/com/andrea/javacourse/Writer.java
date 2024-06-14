package com.andrea.javacourse;

public class Writer {

    public Writer() { }

    public synchronized void write(String text) {
        System.out.print("[" + text);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("]");
    }
}
