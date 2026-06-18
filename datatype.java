public class datatype {
    public static void main(String[] args) {
        System.out.println("hariom");
        int d= 45;
        int g = 67;
        int sum = d+g;
        int sub = d-g;
        int mul = d*g;
        int div = d/g;
        int mod = d%g;
        System.out.println(mod);
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
     System.out.println("===== JAVA DATA TYPES DEMO =====");

        // BYTE
        byte age = 25;
        System.out.println("Byte Value: " + age);
        System.out.println("Byte Min: " + Byte.MIN_VALUE);
        System.out.println("Byte Max: " + Byte.MAX_VALUE);

        // SHORT
        short year = 2026;
        System.out.println("\nShort Value: " + year);
        System.out.println("Short Min: " + Short.MIN_VALUE);
        System.out.println("Short Max: " + Short.MAX_VALUE);

        // INT
        int population = 1000000;
        System.out.println("\nInt Value: " + population);
        System.out.println("Int Min: " + Integer.MIN_VALUE);
        System.out.println("Int Max: " + Integer.MAX_VALUE);

        // LONG
        long mobileNumber = 9876543210L;
        System.out.println("\nLong Value: " + mobileNumber);
        System.out.println("Long Min: " + Long.MIN_VALUE);
        System.out.println("Long Max: " + Long.MAX_VALUE);

        // FLOAT
        float percentage = 89.5f;
        System.out.println("\nFloat Value: " + percentage);

        // DOUBLE
        double salary = 45678.98765;
        System.out.println("Double Value: " + salary);

        // CHAR
        char grade = 'A';
        System.out.println("\nChar Value: " + grade);

        // BOOLEAN
        boolean isJavaEasy = true;
        System.out.println("Boolean Value: " + isJavaEasy);

        // STRING (NON-PRIMITIVE)
        String name = "Hariom";
        System.out.println("\nString Value: " + name);

        // TYPE CASTING
        int number = 100;
        double converted = number;

        System.out.println("\nImplicit Casting");
        System.out.println("Int = " + number);
        System.out.println("Double = " + converted);

        double pi = 3.14159;
        int value = (int) pi;

        System.out.println("\nExplicit Casting");
        System.out.println("Double = " + pi);
        System.out.println("Int = " + value);

        // ARITHMETIC OPERATIONS
        int a = 20;
        int b = 10;

        System.out.println("\nArithmetic Operations");
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));

        // COMPARISON OPERATORS
        System.out.println("\nComparison Operators");
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);

        // LOGICAL OPERATORS
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators");
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);

        // WRAPPER CLASSES
        Integer marks = 95;
        Double amount = 5000.50;
        Character ch = 'H';

        System.out.println("\nWrapper Classes");
        System.out.println(marks);
        System.out.println(amount);
        System.out.println(ch);

        // ASCII VALUE
        char letter = 'A';
        int ascii = letter;

        System.out.println("\nASCII Example");
        System.out.println("Character = " + letter);
        System.out.println("ASCII = " + ascii);

        // UNICODE
        char unicode = '\u0905';
        System.out.println("\nUnicode Character = " + unicode);

        // ARRAY
        int[] numbers = {10,20,30,40,50};

        System.out.println("\nArray Values");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        // FLOAT VS DOUBLE
        float f = 12.3456789f;
        double h = 12.34567891234567;

        System.out.println("\nFloat = " + f);
        System.out.println(h);

        // SIZE OF DATATYPES
        System.out.println("\nSize Information");
        System.out.println("Byte = 1 Byte");
        System.out.println("Short = 2 Bytes");
        System.out.println("Int = 4 Bytes");
        System.out.println("Long = 8 Bytes");
        System.out.println("Float = 4 Bytes");
        System.out.println("Double = 8 Bytes");
        System.out.println("Char = 2 Bytes");
        System.out.println("Boolean = JVM Dependent");

        // REAL EXAMPLE
        String studentName = "Hariom";
        int rollNo = 101;
        double fees = 25000.75;
        char section = 'A';
        boolean passed = true;

        System.out.println("\n===== STUDENT RECORD =====");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Fees: " + fees);
        System.out.println("Section: " + section);
        System.out.println("Passed: " + passed);

        System.out.println("\n===== PROGRAM END =====");
    }
}

