package hariom;
import java.util.Scanner;
public class practies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== PRACTICE PROGRAM =====");

        // ===================================================
        // 1. INTEGER → DOUBLE
        // ===================================================
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        double d1 = a;
        System.out.println("Integer to Double: " + d1);

        // ===================================================
        // 2. DOUBLE → INT
        // ===================================================
        System.out.print("Enter a decimal number: ");
        double d2 = sc.nextDouble();
        int i1 = (int) d2;
        System.out.println("Double to Int: " + i1);

        // ===================================================
        // 3. FLOAT → INT
        // ===================================================
        System.out.print("Enter a float value: ");
        float f1 = sc.nextFloat();
        int i2 = (int) f1;
        System.out.println("Float to Int: " + i2);

        // ===================================================
        // 4. INT → CHAR (ASCII)
        // ===================================================
        System.out.print("Enter a number (0-127): ");
        int ascii = sc.nextInt();
        char ch = (char) ascii;
        System.out.println("Int to Char: " + ch); 
}
}
