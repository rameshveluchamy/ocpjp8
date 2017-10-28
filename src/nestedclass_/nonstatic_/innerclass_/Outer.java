package nestedclass_.nonstatic_.innerclass_;

/**
 * Created by ramesh on 28/10/17.
 */

/*
Rules for an inner class:

    An inner class can access all members of the outer class (even private).
    An inner class can have all levels of access applied (public, protected, private and default).
    An inner class can be final or abstract.
    An inner class can extend other classes and implement interfaces.
    An inner class can be instantiated using .new syntax.
    An inner class is not a subclass of the outer class - no inheritance.
    An outer class is not a superclass of the inner class - no inheritance.
    An inner class cannot declare static variables or static methods.
*/
class Outer {

    private static final int outer_st_final_i = 50;
    private static int outer_st_i = 5;

    private final int outer_final_i = 20;
    private int outer_i = 2;

    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.outer_st_i);

        Inner inner = outer.new Inner(){
            @Override
            public void sayHelloInterface() {
                System.out.println("Hello Interface");
            }

            @Override
            protected void sayHelloAbstract() {
                System.out.println("Hello Abstract");
            }

            @Override
            void absMeth() {
                System.out.println("From AbsClass");
            }

            @Override
            void innerAbstract() {
                System.out.println("Inner Abstract");
            }

        };

        inner.innerMethod();
        inner.inner_i = 50;
        inner.innerMethod();
        inner.sayHelloAbstract();
        inner.sayHelloInterface();
        inner.innerAbstract();
        inner.abstractConcrete();
        inner.absMeth();
    }

    public static void outerMethod_St(){
        System.out.println(outer_st_i
                + "\n" + outer_st_final_i);
    }

    public void outerMethod(){
        System.out.println(outer_st_i
                + "\n" + outer_st_final_i);
    }

    abstract class Inner extends HelloAbstract implements HelloInterface{
        //static int i;   No static inside inner class
        abstract void innerAbstract();
        private int inner_i = 30;

        private void innerMethod(){
            System.out.println(
                      "\n" + outer_i
                    + "\n" + outer_final_i
                    + "\n" + outer_st_i
                    + "\n" + outer_st_final_i
                    + "\n" + inner_i);
        }
    }

    interface HelloInterface {
        void sayHelloInterface();
    }

    abstract static class HelloAbstract extends AbsClass{

        public HelloAbstract() {
        }

        abstract void sayHelloAbstract();

        void abstractConcrete(){
            System.out.println("Abstract Concrete");
        }
    }
}

abstract class AbsClass{
    abstract void absMeth();
}

class Tester{

    public static void main(String[] args) {
        Outer outer = new Outer();

        final Outer.Inner inner = outer.new Inner() {
            @Override
            void innerAbstract() {

            }

            @Override
            public void sayHelloInterface() {

            }

            @Override
            void sayHelloAbstract() {

            }

            @Override
            void absMeth() {

            }
        };
    }

}
