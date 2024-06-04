package com.andrea.classes.heavytask;

import com.andrea.interfaces.IHeavyTaskCompleted;

public class HeavyTask {
    private int counter = 0, iterationsPerCycle = 1000;
    private IHeavyTaskCompleted iHeavyTaskCompleted = null;

    public HeavyTask(IHeavyTaskCompleted iHeavyTaskCompleted) {
        this.iHeavyTaskCompleted = iHeavyTaskCompleted;
    }

    public void start() {
        for (int i=0; i<iterationsPerCycle; i++) {
           for (int j=0; j<iterationsPerCycle; j++) {
               counter++;
               System.out.println("Counter: " + counter);
           }
        }
        iHeavyTaskCompleted.onHeavyTaskCompleted(counter);
    }
}
