package Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        //Serialization - process where an object can be represented as a sequence of bytes that includes the object's
        // data as well as information about the object's type and the types of data stored in the object. The data
        // persists after the program has finished

        User user = new User();

        user.name = "Man";
        user.password = "pass";

        //user.sayHello();

        FileOutputStream outputStream = new FileOutputStream("Serialization\\UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(outputStream);
        out.writeObject(user);
        out.close();
        outputStream.close();

        System.out.println("Saved");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}
