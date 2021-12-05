package Serialization;

import java.io.*;

public class Main2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        User user;

        FileInputStream inputStream = new FileInputStream("Serialization\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(inputStream);

        user = (User) in.readObject();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();

        in.close();
        inputStream.close();

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}
