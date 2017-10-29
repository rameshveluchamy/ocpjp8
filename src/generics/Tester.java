package generics;

public class Tester {

    public static void main(String[] args) {
        MyGenClass<String,Integer> myGenClass = new MyGenClass<>("Hello");

        System.out.println(myGenClass.getT());

        myGenClass.setT("Hey");

        System.out.println(myGenClass.getT());

        System.out.println(myGenClass.meth1(1));

        System.out.println(myGenClass.getT());
    }
}


class MyGenClass<T,Y> {


    T t;

    Y y;

    String s = "s";

    public MyGenClass(T t) {
        this.t = t;
    }


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Y getY() {
        return y;
    }

    public void setY(Y y) {
        this.y = y;
    }

    T meth1(Y y){

        return t;

    }

    <E,F> E meth2(F f){
        System.out.println(f);
        return (E) f;
    }
}
