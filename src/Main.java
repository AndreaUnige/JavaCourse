import com.andrea.javacourse.MyThread;
import com.andrea.javacourse.Writer;

public class Main {
    public static void main(String[] args) {

        Writer myWriter = new Writer();

        MyThread myThread1 = new MyThread(myWriter, "Test");
        MyThread myThread2 = new MyThread(myWriter, "Java");
        MyThread myThread3 = new MyThread(myWriter, "Thread");

    }
}