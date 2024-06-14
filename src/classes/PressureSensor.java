package classes;

import interfaces.ISensorCallback;

public class PressureSensor extends Sensor implements ISensorCallback {

    private final int MAX_VALUE_FOR_PRESSURE = 3;

    private final int DELAY__IN_MILLIS = 0;
    private final int PERIOD_IN_MILLIS = 10000;

    private double pressure = 0;

    public PressureSensor(String sensorName) {
        super(sensorName);
        super.initTimer(MAX_VALUE_FOR_PRESSURE, this);
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
        return this.pressure;
    }


    @Override
    public void onNewDataAvailable(double newData) {
        this.pressure = newData;

        System.out.println(super.toString());
        System.out.println("\t - Pressure: " + this.pressure);
    }
}
