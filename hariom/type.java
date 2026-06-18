package hariom;
import java.util.Scanner;

public class type {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== TYPE CASTING INPUT PROGRAM =====");

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

        // ===================================================
        // 5. CHAR → INT
        // ===================================================
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        int ascii2 = c;
        System.out.println("Char to Int (ASCII): " + ascii2);

        // ===================================================
        // 6. STRING → INT
        // ===================================================
        System.out.print("Enter number in string form: ");
        String s1 = sc.next();
        int n1 = Integer.parseInt(s1);
        System.out.println("String to Int: " + n1);

        // ===================================================
        // 7. INT → STRING
        // ===================================================
        System.out.print("Enter any integer: ");
        int n2 = sc.nextInt();
        String s2 = String.valueOf(n2);
        System.out.println("Int to String: " + s2);

        // ===================================================
        // 8. DIVISION CASTING PROBLEM
        // ===================================================
        System.out.print("Enter numerator: ");
        int num1 = sc.nextInt();

        System.out.print("Enter denominator: ");
        int num2 = sc.nextInt();

        double result = (double) num1 / num2;
        System.out.println("Proper Division Result: " + result);

        // ===================================================
        // 9. OVERFLOW DEMO
        // ===================================================
        System.out.print("Enter a big number (byte range test): ");
        int big = sc.nextInt();
        byte b = (byte) big;
        System.out.println("Byte overflow result: " + b);

        // ===================================================
        // 10. MIXED TYPE CASTING
        // ===================================================
        System.out.print("Enter int value: ");
        int x = sc.nextInt();

        System.out.print("Enter decimal value: ");
        double y = sc.nextDouble();

        double mixed = x + y;
        System.out.println("Mixed (int + double): " + mixed);

        sc.close();

        System.out.println("\n===== END OF TYPE CASTING PROGRAM =====");
    }
}
