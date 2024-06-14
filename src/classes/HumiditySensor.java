package classes;

import interfaces.ISensorCallback;

public class HumiditySensor extends Sensor implements ISensorCallback {

    private final int MAX_VALUE_FOR_HUMIDITY = 3;

    private final int DELAY__IN_MILLIS = 0;
    private final int PERIOD_IN_MILLIS = 3000;

    private double humidity;

    public HumiditySensor(String sensorName) {
        super(sensorName);
        super.initTimer(MAX_VALUE_FOR_HUMIDITY, this);
    }

    @Override
    public void start() {
        super.scheduleTimer(DELAY__IN_MILLIS, PERIOD_IN_MILLIS);
    }

    @Override
    public void stop() {
        super.cancelTimer();
    }

    @Override
    public double getLatestMeasurement() {
        return this.humidity;
    }



    @Override
    public void onNewDataAvailable(double newData) {
        this.humidity = newData;

        System.out.println(super.toString());
        System.out.println("\t - Humidity: " + this.humidity);
    }

}
