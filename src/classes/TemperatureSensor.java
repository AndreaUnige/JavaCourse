package classes;

import interfaces.ISensorCallback;

public class TemperatureSensor extends Sensor implements ISensorCallback {

    private final int MAX_VALUE_FOR_TEMPERATURE = 50;

    private final int DELAY__IN_MILLIS = 0;
    private final int PERIOD_IN_MILLIS = 500;

    private double temperature = 0;

    public TemperatureSensor(String sensorName) {
        super(sensorName);
        super.initTimer(MAX_VALUE_FOR_TEMPERATURE, this);
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
        return this.temperature;
    }

    @Override
    public void onNewDataAvailable(double newData) {
        this.temperature = newData;

        System.out.println(super.toString());
        System.out.println("\t - Temperature: " + temperature);
    }
}
