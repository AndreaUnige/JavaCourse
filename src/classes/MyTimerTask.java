package classes;

import interfaces.ISensorCallback;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

    private int maxValue;
    private ISensorCallback iSensorCallback = null;

    public MyTimerTask(int maxValue, ISensorCallback iSensorCallback) {
        this.maxValue = maxValue;
        this.iSensorCallback = iSensorCallback;
    }

    @Override
    public void run() {
        double sensorData = Math.random() * maxValue;
        iSensorCallback.onNewDataAvailable(sensorData);
    }
}
