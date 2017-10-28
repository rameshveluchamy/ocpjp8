package nestedclass_.nonstatic_.localinnerclass_;

/*
Rules for a local inner class:

        A local inner class has complete access to all the members of the class that it is inside of.
        A local inner class does not have access to the local variables of the method that it is inside of unless those variables are marked final or they are effectively final.
        You cannot specify an access modifier.
        You can specify abstract or final - who knows why you would want to, but you can.
        You cannot mark the class static, and you may not have static variables or methods inside of the class.
        The local class definition must be defined in your code prior to attempting to create an instance.
*/


public class Tester {

    public static void main(String[] args) {

        new Outer().meth("abc");
        Outer.stMeth("xyz");
    }
}

class Outer{

    static int s_i = 5;
    int i = 5;


    static void stMeth(String str){

        int localI = 10;

//        localI++;  Not effectively final. should be final or effectively final


        class LocalInner {
            int localInnerI = 30;

            void localInnerMeth()
            {
                System.out.println(str);
                System.out.println(s_i);
                System.out.println(localI);
                System.out.println(localInnerI);
            }
        }

        new LocalInner().localInnerMeth();

    }

    void meth(String str){

        int localI = 10;

//        localI++;  Not effectively final. should be final or effectively final


        class LocalInner {
            int localInnerI = 30;

            void localInnerMeth()
            {
                System.out.println(i);
                System.out.println(localI);
                System.out.println(localInnerI);
            }
        }

        new LocalInner().localInnerMeth();

    }
}