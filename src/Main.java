import classes.MyRecursiveAction;
import classes.MyRecursiveTask;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {

        // Mere indications. Max number of threads
        // ForkJoinPool forkJoinPool = new ForkJoinPool(4);

        // Automatically tune the CPUs and the cores.
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();

        MyRecursiveAction myRecursiveAction = new MyRecursiveAction(25);
        // forkJoinPool.invoke(myRecursiveAction);

        MyRecursiveTask myRecursiveTask = new MyRecursiveTask(25);
        Long result = forkJoinPool.invoke(myRecursiveTask);
        System.out.println(result);

    }
}