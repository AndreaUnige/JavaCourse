package classes;

public class Motorcycle extends Vehicle {
    private int engineHP;

    public Motorcycle() {
        super();
    }

    public Motorcycle(String name, String color, int nWheels, int engineHP) {
        super(name, color, nWheels);
        this.engineHP = engineHP;
    }

    public String toString() {
        return super.toString() +
                "engineHP: " + this.engineHP;
    }

    @Override
    public float computePrice() {
        return 1000;
    }


    public int getEngineHP() {
        return engineHP;
    }

    public void setEngineHP(int engineHP) {
        this.engineHP = engineHP;
    }
}
