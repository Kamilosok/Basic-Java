package DynamicPolymorphism;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Animal animal;
        System.out.println("1 = Dog, 2 = Cat");
        byte choice = scanner.nextByte();
        switch (choice)
        {
            case 1:
                animal = new Dog();
                animal.speak();
                break;
            case 2:
                animal = new Cat();
                animal.speak();
                break;
            default:
                System.out.println("Wrong number given");
        }
    }
}
