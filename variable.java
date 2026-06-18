public class variable {
    public static void main(String[] args) {
        
 System.out.println("===== VARIABLES IN JAVA =====");

        // 1. Integer variables
        int a = 10;
        int b = 20;
        int sum = a + b;

        System.out.println("Sum = " + sum);

        // 2. Float variables
        float price = 99.99f;
        float tax = 5.5f;
        float total = price + tax;

        System.out.println("Total Price = " + total);

        // 3. Double variables
        double pi = 3.1415926535;
        double radius = 5.5;
        double area = pi * radius * radius;

        System.out.println("Circle Area = " + area);

        // 4. Char variables
        char grade = 'A';
        char section = 'B';

        System.out.println("Grade = " + grade + ", Section = " + section);

        // 5. Boolean variables
        boolean isJavaFun = true;
        boolean isCodingHard = false;

        System.out.println("Java Fun? " + isJavaFun);

        // 6. String variables
        String name = "Hariom";
        String course = "Java Full Stack";

        System.out.println("Name = " + name);
        System.out.println("Course = " + course);

        // 7. Student example
        String studentName = "Rahul";
        int rollNo = 101;
        float marks = 89.5f;

        System.out.println("Student: " + studentName);
        System.out.println("Roll: " + rollNo);
        System.out.println("Marks: " + marks);

        // 8. Salary example
        double basicSalary = 25000;
        double hra = 5000;
        double da = 3000;
        double salary = basicSalary + hra + da;

        System.out.println("Total Salary = " + salary);

        // 9. Swap variables
        int x = 10;
        int y = 20;

        System.out.println("Before Swap: x=" + x + " y=" + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After Swap: x=" + x + " y=" + y);

        // 10. ASCII example
        char ch = 'A';
        int ascii = ch;

        System.out.println("ASCII of A = " + ascii);

        // 11. Age calculation
        int birthYear = 2005;
        int currentYear = 2026;
        int age = currentYear - birthYear;

        System.out.println("Age = " + age);

        // 12. Area examples
        int length = 10;
        int width = 5;
        int rectangleArea = length * width;

        System.out.println("Rectangle Area = " + rectangleArea);

        // 13. Triangle area
        double base = 10;
        double height = 5;
        double triangleArea = 0.5 * base * height;

        System.out.println("Triangle Area = " + triangleArea);

        // 14. Type casting
        int num = 100;
        double converted = num;

        double dValue = 99.99;
        int iValue = (int) dValue;

        System.out.println("Converted = " + converted);
        System.out.println("Cast int = " + iValue);

        // 15. Final constant
        final double PI = 3.14;
        System.out.println("PI = " + PI);

        // 16. Multiple variables
        int a1 = 1, a2 = 2, a3 = 3;
        System.out.println(a1 + a2 + a3);

        // 17. Increment/Decrement
        int inc = 5;
        inc++;
        System.out.println("Increment = " + inc);

        inc--;
        System.out.println("Decrement = " + inc);

        // 18. Logical variables
        boolean login = true;
        boolean premium = false;

        System.out.println("Access = " + (login && premium));

        // 19. Product example
        String product = "Mobile";
        int price2 = 15000;
        boolean available = true;

        System.out.println(product + " " + price2 + " " + available);

        // 20. Banking example
        int balance = 10000;
        int deposit = 5000;
        int withdraw = 2000;

        balance = balance + deposit - withdraw;

        System.out.println("Balance = " + balance);

        System.out.println("===== END OF VARIABLE PROGRAM =====");
    }
}