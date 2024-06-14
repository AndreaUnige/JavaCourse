package classes;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Long> {

    private long workload = 0;

    public MyRecursiveTask(long workload) {
        this.workload = workload;
    }

    @Override
    protected Long compute() {
        Long result = 0l;

        // Rule for work splitting
        if (workload > 5) {
            System.out.println("Too much work, split it: " + workload);

            // Split the work
            long subworkload1 = workload / 2; // ATTENTION: integer division!
            long subworkload2 = workload - subworkload1;

            MyRecursiveTask subtask1 = new MyRecursiveTask(subworkload1);
            MyRecursiveTask subtask2 = new MyRecursiveTask(subworkload2);

            subtask1.fork();
            subtask2.fork();

            // Wait the subtasks to be completed
            result += subtask1.join();
            result += subtask2.join();

        }
        else{
            System.out.println("Doing the work by myself: " + workload);
            result = workload * 2;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
