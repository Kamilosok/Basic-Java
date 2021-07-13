public class Obiekt {

    public static void main(String[] args)
    {
        Car car = new Car("Chevrolet", "Corvette", 2020, "Red");
        car.crash();
        Car.res();
        System.out.print("\n"+car.toString());

        Carer carer = new Carer("Chevroleter", "Corvetteer", 2020, "Reder");
        System.out.print("\n"+carer.toString());
        Carer.res();
    }
}
