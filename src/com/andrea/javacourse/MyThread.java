package com.andrea.javacourse;

public class MyThread implements Runnable {

    private int counterLimit;

    public MyThread(int counterLimit) {
        this.counterLimit = counterLimit;
    }


    @Override
    public void run() {
        long sum = 0;

        for (int i = 0; i < counterLimit; i++) {
            for (int j = 0; j < counterLimit; j++) {
                sum++;
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
