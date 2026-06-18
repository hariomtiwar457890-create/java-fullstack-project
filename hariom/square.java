package hariom;
import java.util.Scanner;

public class square{

    // Square area calculate method
    static int area(int side) {
        return side * side;
    }

    // Check if valid square
    static boolean isValidSquare(int side) {
        return side > 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SQUARE AREA CHECKER PROGRAM =====");

        // multiple test cases (like 200+ practice feel)
        System.out.print("How many times you want to check? ");
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {

            System.out.println("\n--- Test Case " + i + " ---");

            System.out.print("Enter side of square: ");
            int side = sc.nextInt();

            // validation
            if (!isValidSquare(side)) {
                System.out.println("Invalid side! Must be > 0");
                continue;
            }

            // area calculation
            int result = area(side);

            System.out.println("Side = " + side);
            System.out.println("Area of Square = " + result);

            // extra check
            if (result > 100) {
                System.out.println("Large square detected 🔥");
            } else {
                System.out.println("Small square");
            }

            // perfect square check (mathematical meaning)
            int root = (int) Math.sqrt(result);
            if (root * root == result) {
                System.out.println("Area is perfect square number ✔");
            } else {
                System.out.println("Area is NOT perfect square number ❌");
            }
        }

        sc.close();

        System.out.println("\n===== PROGRAM END =====");
    }
}