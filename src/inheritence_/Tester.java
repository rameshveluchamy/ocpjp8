package inheritence_;
import tester.MyTester;

public class Tester {

    public static void main(String[] args) {
        MyTester myT = new MyTester();

        System.out.println(myT.new MyClass().i);

    }
}
