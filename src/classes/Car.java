package classes;

public class Car extends Vehicle {
    private int nDoors;

    public Car() {
        super();
    }

    public Car(String name, String color, int nWheels, int nDoors) {
        super(name, color, nWheels);
        this.nDoors = nDoors;
    }

    public String toString() {
        return super.toString() +
                "nDoors: " + this.nDoors + "\n";
    }

    @Override
    public float computePrice() {
        return 20000;
    }


    public int getnDoors() {
        return nDoors;
    }

    public void setnDoors(int nDoors) {
        this.nDoors = nDoors;
    }
}
