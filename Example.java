import java.io.*;
import java.util.Scanner;
class Example
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a, b, total;
        System.out.println("Enter first number");
        a = scan.nextInt();
        System.out.println("Enter second number");
        b = scan.nextInt();
        total = sum(a,b);
        System.out.println("Sum of two integer is: "+total);
        System.out.println("Done");
    }

    public static int sum(int a, int b)
    {
        int total;
        total = a + b;
        return total;
    }
}