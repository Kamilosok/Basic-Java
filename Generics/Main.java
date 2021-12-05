package Generics;

public class Main {

    public static void main(String[] args)
    {
        /* Generics = enable types (classes and interfaces) to be parameters when defining: classes, interfaces or
        methods, a benefit is to eliminate the need to create multiple versions of methods or classes for various data
        types. Use 1 version for all reference (wrapper) data types.
         */
        Integer intArr[] = {1, 2, 3, 4, 5};
        Double doubleArr[] = {1.1,2.2,3.3,4.4,5.5};
        Character charArr[] = {'H','E','L','L','O'};
        String stringArr[] = {"AA", "BB", "CC"};

        //displayArray(intArr);
        //displayArray(doubleArr);
        //displayArray(charArr);
        //displayArray(stringArr);

        System.out.println(getFirst(intArr));
        System.out.println(getFirst(doubleArr));
        System.out.println(getFirst(charArr));
        System.out.println(getFirst(stringArr));

    }
    public static <T> void displayArray(T[] array)
    {
        for(T x : array)
        {
            System.out.println(x + " ");
        }
    }

    public static <T> T getFirst(T[] array)
    {
        return array[0];
    }
}
