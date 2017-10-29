package stream;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Tester {

    public static void main(String[] args) {

        List<String> animalList = Arrays.asList("Dog","Cow", "Elephant", "Crocodile","Goat");
        List<Character> charList = Arrays.asList('a','b','c','d','e');
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        List<Double> doubleList = Arrays.asList(1.0,2.0,3.0,4.0,5.0);
        List<MyClass> myClassList = Arrays.asList(new MyClass(),new MyClass(),new MyClass(),new MyClass(),new MyClass());

        Stream<String> stringStream = animalList.stream();

        System.out.println(animalList.stream()
                .filter(animal -> animal.equals("Dog"))
                .findFirst()
                .orElse("No Dog"));

    }
}

class MyClass{
    int i;
    String string;
}


