import threads.MyThread;

public class Main {

    public static void main(String[] args) {


        MyThread t1 = new MyThread("T1");
        MyThread t2 = new MyThread("T2");

        // Join
        try {
            t1.t.join();
            t2.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main thread exiting!");
    }
}