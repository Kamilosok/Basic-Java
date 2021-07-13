package DynamicPolymorphism;

public class Dog extends Animal{
    @Override
    public void speak()
    {
        System.out.println("The dog goes *bark*");
    }

    /*
    public void dig()
    {
        System.out.println("The dog digs!");
    }
     */
}
