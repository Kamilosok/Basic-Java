public class Car {

    final private String make;
    final private String model;
    final private int year;
    private String color;

    Car(String make, String model, int year, String color)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void crash()
    {
        System.out.print("The car: " + color + ' ' + model + " has crashed!");
    }

    public static void res()
    {
        System.out.print("\nTester");
    }

    public String toString()
    {
        String myString = make + " " + model + " " + year + " " + color;
        return myString;
    }

}
