package hariom;
import java.util.Scanner;
public class artmetic {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter first number");
  int a = sc.nextInt();
  System.out.println("Enter second number");
  int b = sc.nextInt();
  System.out.println("Enter operator (+, -, *, /)");
  char op = sc.next().charAt(0);
  int result;
  switch(op) {
   case '+':
    result = a + b;
    System.out.println("Result: " + result);
    break;
   case '-':
    result = a - b;
    System.out.println("Result: " + result);
    break;
   case '*':
    result = a * b;
    System.out.println("Result: " + result);
    break;
   case '/':
    if(b != 0) {
     result = a / b;
     System.out.println("Result: " + result);
    } else {
     System.out.println("Error: Division by zero");
    }
    break;
   default:
    System.out.println("Invalid operator");
    break;
  }
  sc.close();
 }   
}