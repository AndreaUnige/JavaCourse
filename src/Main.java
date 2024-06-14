import com.andrea.javacourse.MyThread;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        final int N_THREADS = 100;
        final int BOUND = 1000;

        Thread[] threads = new Thread[N_THREADS];
        for (int i = 0; i < N_THREADS; i++) {
            int counterLimit = new Random().nextInt(BOUND);

            MyThread theTask = new MyThread(counterLimit);
            Thread worker = new Thread(theTask);

            worker.setName("Thread " + i);
            worker.start();

            threads[i] = worker;
        }

        int nThreadsRunning = 0;

        do {
            nThreadsRunning = 0;
            for (Thread singleThread : threads) {
                if(singleThread.isAlive())
                    nThreadsRunning++;
            }
            System.out.println("Numero thread attivi: " + nThreadsRunning);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } while (nThreadsRunning > 0);

    }
}