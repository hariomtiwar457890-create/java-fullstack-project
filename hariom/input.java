package hariom;
import java.util.Scanner;

public class input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== JAVA INPUT EXAMPLES =====");

        // 1. String input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // 2. Integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // 3. Float input
        System.out.print("Enter your marks: ");
        float marks = sc.nextFloat();

        // 4. Double input
        System.out.print("Enter your height (in cm): ");
        double height = sc.nextDouble();

        // 5. Character input
        System.out.print("Enter your grade (A/B/C): ");
        char grade = sc.next().charAt(0);

        // Output
        System.out.println("\n===== OUTPUT =====");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Marks  : " + marks);
        System.out.println("Height : " + height);
        System.out.println("Grade  : " + grade);

        sc.close();
    }
}