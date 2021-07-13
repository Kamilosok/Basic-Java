public class EncapsCarH {
    public static void main(String[] args)
    {
        EncapsCar car1 = new EncapsCar("Chevrolet", "Camaro", 2021);
        //EncapsCar car2 = new EncapsCar("Ford", "Mustang", 2022);
        //car2.copy(car1);
        EncapsCar car2 = new EncapsCar(car1);

        System.out.println(car1);
        System.out.println(car2 + "\n");

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());




    }

}
