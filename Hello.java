import java.util.Scanner;

public class Hello {
    public static void main(String[] args)
    {
        int num, num2;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        num2 = sc.nextInt();
        System.out.print("Sum: " + num + num2);
    }
}