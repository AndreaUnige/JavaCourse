package threads;

public class MyThread implements Runnable {
    String name;
    public Thread t = null;

    public MyThread (String name) {
        this.name= name;
        this.t = new Thread(this, this.name);
        this.t.start();
    }

    @Override
    public void run() {
        for (int i=5; i > 0; i--) {
            System.out.println(this.name + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(this.name + " DONE!");
    }


}
