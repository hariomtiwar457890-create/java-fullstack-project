package hariom;
import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        double b = a; // Implicit type casting
        System.out.println("Integer value: " + a);
        System.out.println("Double value: " + b);
        sc.close();
    }
}
