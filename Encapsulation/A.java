package Encapsulation;
import Encapsulation2.*;

public class A {
    public static void main(String[] args)
    {
        C c = new C();
        System.out.println(c.defaultMessage);
        ASub.outer();
        B b = new B();
        b.goB();
    }

    protected static String aMessage = "AA";

}
