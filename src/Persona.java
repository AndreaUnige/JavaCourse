import exepetions.NegativeAge;

public class Persona {
    private int eta;

    public Persona(int eta) throws NegativeAge {
        if (eta < 0)
            throw new NegativeAge("Age cannot be negative");
    }

    public void checkAge(int eta) {
        if (eta < 0)
            throw new ArithmeticException("Eta negativa");

        if (eta > 150)
            throw new ArithmeticException("Eta too high");
    }
}
