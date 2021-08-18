import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.println("Enter a number to divide: ");
            int x = scanner.nextInt();
            System.out.println("Enter a number to divide by: ");
            int y = scanner.nextInt();
            int z = x/y;
            System.out.println(z);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can't divide by 0");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Wrong data type");
        }
        catch (java.lang.Exception e)
        {
            System.out.println("Something went wrong");
        }
        
        finally {
            System.out.println("Program finished");
            scanner.close();
        }
    }
}
