package com.andrea.javacourse;

public class MyThread implements Runnable {

    Writer myWriter = null;
    String message;
    Thread t;

    public MyThread(Writer myWriter, String message) {
        this.myWriter = myWriter;
        this.message = message;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        this.myWriter.write(this.message);
    }
}
