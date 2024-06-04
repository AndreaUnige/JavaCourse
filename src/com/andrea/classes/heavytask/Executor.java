package com.andrea.classes.heavytask;

import com.andrea.interfaces.IHeavyTaskCompleted;

public class Executor implements IHeavyTaskCompleted {
    private HeavyTask theTask = null;

    public Executor() {
        this.theTask = new HeavyTask(this);
    }

    public void startTheHeavyTask() {
        this.theTask.start();

    }

    private void taskDone(int i) {
    }

    @Override
    public void onHeavyTaskCompleted(int countResult) {
        System.out.println("Heavy Task done! Counter: " + countResult);
    }

}
