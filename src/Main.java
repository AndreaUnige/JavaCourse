import exepetions.NegativeAge;

public class Main {

    public static void instantiatePersona() throws NegativeAge {
        Persona p = new Persona(1);
    }

    public static void main(String[] args) {

        /*
        int[] myNumbers = {1,2,3};
        try {
            System.out.println(myNumbers[1]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Blocco catch");
            e.printStackTrace();
        }
         System.out.println("Finally!");
        */

        /*
        try{
            Persona p = new Persona();
            p.checkAge(-1);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        */

        try {
            Persona p1 = new Persona(3);
        } catch (NegativeAge e) {
            throw new RuntimeException(e);
        }
        finally {

        }

        try {
            instantiatePersona();
        } catch (NegativeAge e) {
            throw new RuntimeException(e);
        }


    }
}