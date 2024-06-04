import com.andrea.classes.animals.Cat;
import com.andrea.classes.animals.Dog;
import com.andrea.classes.heavytask.Executor;
import com.andrea.interfaces.IAction;
import com.andrea.interfaces.IResidency;

public class Main {
    public static void main(String[] args) {


        Executor myExecutor = new Executor();
        myExecutor.startTheHeavyTask();


        /*
        IAction[] myZoo = new IAction[2];
        myZoo[0] = new Dog("Fido", 2);
        myZoo[1] = new Cat("Micio", 5);

        for(IAction singleAnimal : myZoo) {
            System.out.println(singleAnimal.toString());
            singleAnimal.run();
        }
        */



    }
}