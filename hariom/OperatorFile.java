package hariom;
public class OperatorFile {

    public static void main(String[] args) {

        System.out.println("========== JAVA OPERATORS ==========\n");

        // =====================================================
        // 1. ARITHMETIC OPERATORS
        // =====================================================
        int a = 20;
        int b = 10;

        System.out.println("1. ARITHMETIC OPERATORS");
        System.out.println("Addition (+) = " + (a + b));
        System.out.println("Subtraction (-) = " + (a - b));
        System.out.println("Multiplication (*) = " + (a * b));
        System.out.println("Division (/) = " + (a / b));
        System.out.println("Modulus (%) = " + (a % b));

        // =====================================================
        // 2. UNARY OPERATORS
        // =====================================================
        int x = 5;

        System.out.println("\n2. UNARY OPERATORS");
        System.out.println("Original x = " + x);

        System.out.println("Post Increment x++ = " + (x++));
        System.out.println("After x++ = " + x);

        System.out.println("Pre Increment ++x = " + (++x));

        System.out.println("Post Decrement x-- = " + (x--));
        System.out.println("After x-- = " + x);

        System.out.println("Pre Decrement --x = " + (--x));

        // =====================================================
        // 3. ASSIGNMENT OPERATORS
        // =====================================================
        int num = 10;

        System.out.println("\n3. ASSIGNMENT OPERATORS");

        num += 5;
        System.out.println("num += 5 = " + num);

        num -= 2;
        System.out.println("num -= 2 = " + num);

        num *= 3;
        System.out.println("num *= 3 = " + num);

        num /= 2;
        System.out.println("num /= 2 = " + num);

        num %= 4;
        System.out.println("num %= 4 = " + num);

        // =====================================================
        // 4. RELATIONAL OPERATORS
        // =====================================================
        int p = 20;
        int q = 15;

        System.out.println("\n4. RELATIONAL OPERATORS");

        System.out.println("p == q : " + (p == q));
        System.out.println("p != q : " + (p != q));
        System.out.println("p > q  : " + (p > q));
        System.out.println("p < q  : " + (p < q));
        System.out.println("p >= q : " + (p >= q));
        System.out.println("p <= q : " + (p <= q));

        // =====================================================
        // 5. LOGICAL OPERATORS
        // =====================================================
        boolean c1 = true;
        boolean c2 = false;

        System.out.println("\n5. LOGICAL OPERATORS");

        System.out.println("c1 && c2 = " + (c1 && c2));
        System.out.println("c1 || c2 = " + (c1 || c2));
        System.out.println("!c1 = " + (!c1));
        System.out.println("!c2 = " + (!c2));

        // =====================================================
        // 6. BITWISE OPERATORS
        // =====================================================
        int m = 5;   // 0101
        int n = 3;   // 0011

        System.out.println("\n6. BITWISE OPERATORS");

        System.out.println("m & n = " + (m & n));
        System.out.println("m | n = " + (m | n));
        System.out.println("m ^ n = " + (m ^ n));
        System.out.println("~m = " + (~m));

        // =====================================================
        // 7. SHIFT OPERATORS
        // =====================================================
        int s = 8;

        System.out.println("\n7. SHIFT OPERATORS");

        System.out.println("s << 1 = " + (s << 1));
        System.out.println("s >> 1 = " + (s >> 1));
        System.out.println("s >>> 1 = " + (s >>> 1));

        // =====================================================
        // 8. TERNARY OPERATOR
        // =====================================================
        int age = 18;

        String result = (age >= 18)
                ? "Eligible for Voting"
                : "Not Eligible";

        System.out.println("\n8. TERNARY OPERATOR");
        System.out.println(result);

        // =====================================================
        // 9. INSTANCEOF OPERATOR
        // =====================================================
        String name = "Hariom";

        System.out.println("\n9. INSTANCEOF OPERATOR");
        System.out.println(name instanceof String);

        // =====================================================
        // 10. OPERATOR PRECEDENCE
        // =====================================================
        int value = 10 + 5 * 2;

        System.out.println("\n10. OPERATOR PRECEDENCE");
        System.out.println("10 + 5 * 2 = " + value);

        // =====================================================
        // 11. COMBINED EXAMPLE
        // =====================================================
        int marks = 75;

        System.out.println("\n11. COMBINED EXAMPLE");

        String grade = (marks >= 90) ? "A"
                     : (marks >= 80) ? "B"
                     : (marks >= 70) ? "C"
                     : (marks >= 60) ? "D"
                     : "Fail";

        System.out.println("Marks = " + marks);
        System.out.println("Grade = " + grade);

        System.out.println("\n========== END OF OPERATORS ==========");
    }
}