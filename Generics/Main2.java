package Generics;

public class Main2 {
    public static void main(String[] args)
    {
        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1,2);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(1.1, 2.3);
        MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@', 'a');
        MyGenericClass<String, Character> myString = new MyGenericClass<>("AAA", 'a');

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

        //Bounded types - objects of generic class have data of specific derived types ex.Number

        BoundedGeneric boundedGeneric = new BoundedGeneric(1);

        System.out.println(boundedGeneric.getValue());
    }
}
