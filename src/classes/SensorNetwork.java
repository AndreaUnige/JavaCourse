package classes;

public class SensorNetwork {
    private final int NUM_MAX_SENSORS = 3;

    private Sensor[] sensors;

    public SensorNetwork() {
        sensors = new Sensor[NUM_MAX_SENSORS];
    }

    public void addSensor(Sensor sensor, int index) throws Exception {
        if ((sensors == null) || (sensors.length == 0))
            throw new Exception("Sensor net NULL");

        sensors[index] = sensor;
    }

    public void startSensor(Sensor sensor) {
        for (Sensor s : sensors) {
            if (s == sensor)
                s.start();
        }
    }

    public void stopSensor(Sensor sensor) {
        for (Sensor s : sensors) {
            if (s == sensor)
                s.stop();
        }
    }


}
