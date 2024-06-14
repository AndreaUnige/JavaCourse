import classes.HumiditySensor;
import classes.PressureSensor;
import classes.SensorNetwork;
import classes.TemperatureSensor;

public class Main {
    public static void main(String[] args) {

        SensorNetwork myNet = new SensorNetwork();

        TemperatureSensor temp = new TemperatureSensor("temperature");
        PressureSensor press = new PressureSensor("pressure");
        HumiditySensor hum = new HumiditySensor("humidity");

        try {
            myNet.addSensor(temp, 0);
            myNet.addSensor(press, 1);
            myNet.addSensor(hum, 2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        myNet.startSensor(temp);
        myNet.startSensor(press);
        myNet.startSensor(hum);



    }
}