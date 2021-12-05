package Generics;

public class BoundedGeneric <T extends Number>{
    T x;
    //Limited to numbers
    public BoundedGeneric(T x)
    {
        this.x = x;
    }

    public T getValue()
    {
        return x;
    }

}
