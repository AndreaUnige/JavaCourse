package classes;

import interfaces.ISensorCallback;

import java.util.Timer;
import java.util.TimerTask;

public abstract class Sensor {

    private String sensorName;
    private Timer timer;
    private TimerTask timerTask;

    public Sensor(String sensorName) {
        this.sensorName = sensorName;
            }

    public void initTimer(int maxValue, ISensorCallback iSensorCallback) {
        timer = new Timer();
        timerTask = new MyTimerTask(maxValue, iSensorCallback);
    }

    public void scheduleTimer(int delay, int period) {
        timer.scheduleAtFixedRate(timerTask, delay, period);
    }

    public void cancelTimer() {
        timer.cancel();
    }


    public String toString() {
        return "New data available for " + sensorName;
    }

    public String getSensorName() { return this.sensorName; }

    public abstract void start();
    public abstract void stop();

    public abstract double getLatestMeasurement();

}
