package classes;

public class Bike extends Vehicle {
    private int saddleHeight_inCm;

    public Bike() {
        super();
    }

    public Bike(String name, String color, int nWheels, int saddleHeight_inCm) {
        super(name, color, nWheels);
        this.saddleHeight_inCm = saddleHeight_inCm;
    }

    public String toString() {
        return super.toString() +
                "saddleHeight [cm]: " + this.saddleHeight_inCm;
    }

    @Override
    public float computePrice() {
        return 100;
    }

    public int getSaddleHeight_inCm() {
        return saddleHeight_inCm;
    }

    public void setSaddleHeight_inCm(int saddleHeight_inCm) {
        this.saddleHeight_inCm = saddleHeight_inCm;
    }
}
