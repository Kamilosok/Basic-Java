package Serialization;

import java.io.Serializable;

public class User implements Serializable {


    private static final long serialVersionUID =1;
    String name;
    transient String password;
    //Serialization ignores transient fields (Doesn't save)

    public void sayHello()
    {
        System.out.println("Hello");
    }
}
