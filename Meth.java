public class Meth {
    public static void main(String[] args)
    {
        System.out.print(add(1,2)+"\n");
        System.out.print(add(1,2, 3)+"\n");
        System.out.print(add(1,2, 3, 4)+"\n");

        System.out.print(add((float) 1, (float) 2));

    }

    static int add(int a, int b)
    {
        return a + b;
    }

    static int add(int a, int b, int c)
    {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d)
    {
        return  a + b + c + d;
    }

    static float add(float a, float b)
    {
        return  a + b;
    }

}
