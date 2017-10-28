package nestedclass_.nonstatic_.anonymousinnerclass_;

public class Tester {

    public static void main(String[] args) {
        test();
    }

    public static void test(){

        new ConcreClOne(){
            @Override
            void meth1() {
                System.out.println("C1.methh1.overridden");;
            }
        }.meth1();

        new AbsClOne(){
            @Override
            void meth1() {
                System.out.println("Abs meth Impl");
            }
        }.meth1();

        new IFace(){
            @Override
            public void test() {
                System.out.println("IFace impl");
            }
        }.test();


        new IFace(){
            @Override
            public void test() {
                System.out.println("IFace impl");
            }
        }.defaultTest();



        System.out.println(new IFace() {
            @Override
            public void test() {
                System.out.println("IFace impl");
            }
        }.final_i);


        IFace.staticTest();

        System.out.println(IFace.st_final_i);

        System.out.println(IFace.final_i);


    }
}

class ConcreClOne{

    void meth1(){
        System.out.println("C1.meth1");
    }
}


abstract class AbsClOne{

    abstract void meth1();

}

interface IFace{
    final int final_i = 10;

    static final int st_final_i = 100; //Interface variable are static & final by default

    public void test();  //Interface method public by default.

    default public void defaultTest(){ //public by default
        System.out.println("default method");
    }

    static public void staticTest(){ //public by default
        System.out.println("static test");
    }
}



