package classes;

import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {

    private long workload = 0;

    public MyRecursiveAction(long workload) {
        this.workload = workload;
    }

    @Override
    protected void compute() {
        // Rule for work splitting
        if (workload > 5) {
            System.out.println("Too much work, split it: " + workload);

            // Split the work
            long subworkload1 = workload / 2; // ATTENTION: integer division!
            long subworkload2 = workload - subworkload1;

            MyRecursiveAction subtask1 = new MyRecursiveAction(subworkload1);
            MyRecursiveAction subtask2 = new MyRecursiveAction(subworkload2);

            subtask1.fork();
            subtask2.fork();
        }
        else {
            System.out.println("Doing the work by myself: " + workload);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
