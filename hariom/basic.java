package hariom;


//  Basic.java  —  Java ke sabhi basic concepts + examples
//  ~800+ lines | Hindi comments ke saath


import java.util.*;
import java.util.stream.*;

public class basic {

    // ===========================================================
    // 1. VARIABLES aur DATA TYPES
    // ===========================================================
    static void dataTypes() {
        System.out.println("\n===== 1. DATA TYPES =====");

        // Primitive types
        byte   b   = 100;            // -128 to 127
        short  s   = 30000;          // -32768 to 32767
        int    i   = 1_000_000;      // sabse common integer
        long   l   = 9_000_000_000L; // bada number, L suffix
        float  f   = 3.14f;          // single precision, f suffix
        double d   = 3.14159265358;  // double precision
        char   c   = 'A';            // ek character
        boolean ok = true;           // true / false

        System.out.println("byte   : " + b);
        System.out.println("short  : " + s);
        System.out.println("int    : " + i);
        System.out.println("long   : " + l);
        System.out.println("float  : " + f);
        System.out.println("double : " + d);
        System.out.println("char   : " + c);
        System.out.println("boolean: " + ok);

        // String (reference type)
        String name = "Java Programming";
        System.out.println("String : " + name);

        // Type casting
        double pi   = 3.99;
        int    piInt = (int) pi;   // explicit cast → 3 (truncate)
        System.out.println("Cast double→int: " + piInt);

        int num   = 50;
        double d2 = num;           // implicit (widening)
        System.out.println("Widening int→double: " + d2);
    }

    // ===========================================================
    // 2. OPERATORS
    // ===========================================================
    static void operators() {
        System.out.println("\n===== 2. OPERATORS =====");

        int a = 15, b = 4;

        // Arithmetic
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));   // integer division
        System.out.println("a % b = " + (a % b));   // remainder

        // Relational
        System.out.println("a > b  : " + (a > b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Logical
        boolean x = true, y = false;
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));

        // Bitwise
        System.out.println("a & b  : " + (a & b));
        System.out.println("a | b  : " + (a | b));
        System.out.println("a ^ b  : " + (a ^ b));
        System.out.println("a << 1 : " + (a << 1));  // multiply by 2
        System.out.println("a >> 1 : " + (a >> 1));  // divide by 2

        // Ternary
        String result = (a > b) ? "a bada hai" : "b bada hai";
        System.out.println("Ternary: " + result);

        // Compound assignment
        int n = 10;
        n += 5;  System.out.println("n += 5  : " + n);
        n -= 3;  System.out.println("n -= 3  : " + n);
        n *= 2;  System.out.println("n *= 2  : " + n);
        n /= 4;  System.out.println("n /= 4  : " + n);
        n %= 3;  System.out.println("n %= 3  : " + n);
    }

    // ===========================================================
    // 3. CONTROL FLOW — if / else / switch
    // ===========================================================
    static void controlFlow() {
        System.out.println("\n===== 3. CONTROL FLOW =====");

        int marks = 75;

        // if-else
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F — Fail");
        }

        // switch-case
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday");   break;
            case 2: System.out.println("Tuesday");  break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday");   break;
            default: System.out.println("Weekend");
        }

        // switch with String (Java 7+)
        String season = "Summer";
        switch (season) {
            case "Summer" : System.out.println("Garmi ka mausam!"); break;
            case "Winter" : System.out.println("Thandi!"); break;
            case "Monsoon": System.out.println("Baarish!"); break;
            default       : System.out.println("Aur koi mausam");
        }
    }

    // ===========================================================
    // 4. LOOPS — for / while / do-while / enhanced-for
    // ===========================================================
    static void loops() {
        System.out.println("\n===== 4. LOOPS =====");

        // for loop
        System.out.print("for (1–5): ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // while loop
        System.out.print("while (10 se 1): ");
        int n = 10;
        while (n >= 1) {
            System.out.print(n + " ");
            n--;
        }
        System.out.println();

        // do-while
        System.out.print("do-while: ");
        int x = 1;
        do {
            System.out.print(x + " ");
            x += 2;
        } while (x <= 9);
        System.out.println();

        // enhanced for (for-each)
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("for-each: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        // break and continue
        System.out.print("break example: ");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) break;
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("continue (skip even): ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        // nested loops — multiplication table
        System.out.println("2 ka table:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 x " + i + " = " + (2 * i));
        }
    }

    // ===========================================================
    // 5. ARRAYS — 1D, 2D, jagged
    // ===========================================================
    static void arrays() {
        System.out.println("\n===== 5. ARRAYS =====");

        // 1D array declare + initialize
        int[] nums = {5, 3, 8, 1, 9, 2, 7, 4, 6};
        System.out.println("Array length: " + nums.length);
        System.out.println("Index 0 : " + nums[0]);
        System.out.println("Index 4 : " + nums[4]);

        // Array ko sort karo
        Arrays.sort(nums);
        System.out.print("Sorted  : ");
        for (int v : nums) System.out.print(v + " ");
        System.out.println();

        // Binary search
        int idx = Arrays.binarySearch(nums, 7);
        System.out.println("7 found at index: " + idx);

        // Array copy
        int[] copy = Arrays.copyOf(nums, nums.length);
        System.out.println("Copy same as original: " + Arrays.equals(nums, copy));

        // 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("2D Matrix:");
        for (int[] row : matrix) {
            for (int val : row) System.out.printf("%3d", val);
            System.out.println();
        }

        // Jagged array
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{1};
        jagged[1] = new int[]{2, 3};
        jagged[2] = new int[]{4, 5, 6};
        System.out.println("Jagged array:");
        for (int[] row : jagged) System.out.println(Arrays.toString(row));

        // String array
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};
        System.out.println("Fruits: " + Arrays.toString(fruits));
    }

    // ===========================================================
    // 6. STRINGS — common methods
    // ===========================================================
    static void strings() {
        System.out.println("\n===== 6. STRINGS =====");

        String s1 = "  Hello, Java World!  ";
        String s2 = "hello, java world!";

        System.out.println("Original  : '" + s1 + "'");
        System.out.println("trim()    : '" + s1.trim() + "'");
        System.out.println("length()  : " + s1.trim().length());
        System.out.println("upper()   : " + s1.trim().toUpperCase());
        System.out.println("lower()   : " + s1.trim().toLowerCase());
        System.out.println("charAt(7) : " + s1.trim().charAt(7));
        System.out.println("indexOf(J): " + s1.indexOf('J'));
        System.out.println("contains  : " + s1.contains("Java"));
        System.out.println("startsWith: " + s1.trim().startsWith("Hello"));
        System.out.println("endsWith  : " + s1.trim().endsWith("!"));
        System.out.println("replace   : " + s1.trim().replace("Java", "Python"));
        System.out.println("substring : " + s1.trim().substring(7, 11));

        // split
        String csv = "Ram,Shyam,Geeta,Mohan";
        String[] names = csv.split(",");
        System.out.println("Split CSV: " + Arrays.toString(names));

        // equals vs ==
        String a = new String("Java");
        String b = new String("Java");
        System.out.println("== check   : " + (a == b));        // false
        System.out.println(".equals()  : " + a.equals(b));     // true
        System.out.println("equalsIgnore: " + s1.trim().equalsIgnoreCase(s2.trim()));

        // String.format
        String msg = String.format("Name: %s, Age: %d, GPA: %.2f", "Ravi", 20, 8.75);
        System.out.println("format(): " + msg);

        // StringBuilder — fast concatenation
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            sb.append("Item").append(i);
            if (i < 5) sb.append(", ");
        }
        System.out.println("StringBuilder: " + sb.toString());

        // String.join
        String joined = String.join(" | ", "Delhi", "Mumbai", "Chennai");
        System.out.println("join(): " + joined);
    }

    // ===========================================================
    // 7. METHODS — overloading + recursion
    // ===========================================================
    static int add(int a, int b)          { return a + b; }
    static double add(double a, double b) { return a + b; }       // overload
    static int add(int a, int b, int c)   { return a + b + c; }   // overload

    static long factorial(int n) {                 // recursion
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    static int fibonacci(int n) {                  // recursion
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    static void swapByValue(int a, int b) {
        // Java pass-by-value: original nahi badlega
        int temp = a; a = b; b = temp;
        System.out.println("Inside swap: a=" + a + ", b=" + b);
    }

    // varargs
    static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) total += n;
        return total;
    }

    static void methodExamples() {
        System.out.println("\n===== 7. METHODS =====");

        System.out.println("add(3,4)     = " + add(3, 4));
        System.out.println("add(1.5,2.5) = " + add(1.5, 2.5));
        System.out.println("add(1,2,3)   = " + add(1, 2, 3));

        System.out.println("5! = " + factorial(5));
        System.out.println("10! = " + factorial(10));

        System.out.print("Fibonacci (0-9): ");
        for (int i = 0; i < 10; i++) System.out.print(fibonacci(i) + " ");
        System.out.println();

        System.out.print("Primes upto 30: ");
        for (int i = 2; i <= 30; i++) if (isPrime(i)) System.out.print(i + " ");
        System.out.println();

        int p = 5, q = 10;
        swapByValue(p, q);
        System.out.println("After swap call: p=" + p + ", q=" + q); // unchanged

        System.out.println("sum(1,2,3,4,5) = " + sum(1, 2, 3, 4, 5));
        System.out.println("sum(10,20)     = " + sum(10, 20));
    }

    // ===========================================================
    // 8. OOP — Classes, Objects, Constructors, this
    // ===========================================================
    static class Student {
        // Instance variables
        private String name;
        private int    age;
        private double gpa;

        // Default constructor
        Student() {
            this("Unknown", 0, 0.0);
        }

        // Parameterized constructor
        Student(String name, int age, double gpa) {
            this.name = name;
            this.age  = age;
            this.gpa  = gpa;
        }

        // Getters
        String getName() { return name; }
        int    getAge()  { return age;  }
        double getGpa()  { return gpa;  }

        // Setters
        void setGpa(double gpa) { this.gpa = gpa; }

        // Method
        String getGrade() {
            if (gpa >= 9.0) return "A+";
            if (gpa >= 8.0) return "A";
            if (gpa >= 7.0) return "B";
            return "C";
        }

        @Override
        public String toString() {
            return String.format("Student{name='%s', age=%d, gpa=%.2f, grade=%s}",
                                 name, age, gpa, getGrade());
        }
    }

    static void oopBasics() {
        System.out.println("\n===== 8. OOP BASICS =====");

        Student s1 = new Student("Priya", 20, 9.2);
        Student s2 = new Student("Rahul", 21, 7.8);
        Student s3 = new Student();  // default

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s2.setGpa(8.1);
        System.out.println("After update: " + s2);
    }

    // ===========================================================
         // 9. INHERITANCE
    // ===========================================================
    static class Animal {
        String name;

        Animal(String name) { this.name = name; }

        void sound() { System.out.println(name + " koi awaaz karta hai"); }

        void eat()   { System.out.println(name + " khaana khata hai"); }
    }

    static class Dog extends Animal {
        String breed;

        Dog(String name, String breed) {
            super(name);
            this.breed = breed;
        }

        @Override
        void sound() { System.out.println(name + " (Dog) bhaukta hai: Woof!"); }

        void fetch() { System.out.println(name + " ball laata hai!"); }
    }

    static class Cat extends Animal {
        Cat(String name) { super(name); }

        @Override
        void sound() { System.out.println(name + " (Cat) bolti hai: Meow!"); }
    }

    static void inheritance() {
        System.out.println("\n===== 9. INHERITANCE =====");

        Dog dog = new Dog("Tommy", "Labrador");
        Cat cat = new Cat("Kitty");

        dog.sound();
        dog.eat();
        dog.fetch();
        cat.sound();
        cat.eat();

        // Upcasting
        Animal a = dog;
        a.sound(); // calls Dog's overridden version → polymorphism

        System.out.println("dog instanceof Animal : " + (dog instanceof Animal));

    }

    // ===========================================================
    // 10. INTERFACES & ABSTRACT CLASSES
    // ===========================================================
    interface Shape {
        double area();
        double perimeter();
        default String describe() {
            return String.format("Area=%.2f, Perimeter=%.2f", area(), perimeter());
        }
    }

    static class Circle implements Shape {
        double radius;
        Circle(double r) { this.radius = r; }

        @Override public double area()      { return Math.PI * radius * radius; }
        @Override public double perimeter() { return 2 * Math.PI * radius; }
        @Override public String toString()  { return "Circle(r=" + radius + ") → " + describe(); }
    }

    static class Rectangle implements Shape {
        double w, h;
        Rectangle(double w, double h) { this.w = w; this.h = h; }

        @Override public double area()      { return w * h; }
        @Override public double perimeter() { return 2 * (w + h); }
        @Override public String toString()  { return "Rectangle(" + w + "x" + h + ") → " + describe(); }
    }

    static abstract class Vehicle {
        String brand;
        int    speed;

        Vehicle(String brand, int speed) {
            this.brand = brand;
            this.speed = speed;
        }

        abstract void fuelType();

        void showInfo() {
            System.out.println(brand + " | Max speed: " + speed + " kmph");
        }
    }

    static class Car extends Vehicle {
        Car(String brand, int speed) { super(brand, speed); }
        @Override void fuelType() { System.out.println(brand + " → Petrol/Diesel"); }
    }

    static class ElectricCar extends Vehicle {
        ElectricCar(String brand, int speed) { super(brand, speed); }
        @Override void fuelType() { System.out.println(brand + " → Electric Battery"); }
    }

    static void interfacesAbstract() {
        System.out.println("\n===== 10. INTERFACES & ABSTRACT =====");

        Shape c = new Circle(7);
        Shape r = new Rectangle(5, 8);
        System.out.println(c);
        System.out.println(r);

        // Polymorphism with array
        Shape[] shapes = {new Circle(3), new Rectangle(4, 6), new Circle(10)};
        double totalArea = 0;
        for (Shape s : shapes) totalArea += s.area();
        System.out.printf("Total area of all shapes: %.2f%n", totalArea);

        Vehicle v1 = new Car("Toyota", 180);
        Vehicle v2 = new ElectricCar("Tesla", 250);
        v1.showInfo(); v1.fuelType();
        v2.showInfo(); v2.fuelType();
    }

    // ===========================================================
    // 11. COLLECTIONS — List, Set, Map, Queue
    // ===========================================================
    static void collections() {
        System.out.println("\n===== 11. COLLECTIONS =====");

        // ArrayList
        List<String> list = new ArrayList<>(Arrays.asList("Banana","Apple","Mango","Orange","Grapes"));
        System.out.println("ArrayList: " + list);
        list.add("Pineapple");
        list.remove("Banana");
        Collections.sort(list);
        System.out.println("After sort/remove/add: " + list);
        System.out.println("Contains Mango: " + list.contains("Mango"));
        System.out.println("Size: " + list.size());

        // LinkedList as Queue
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
        queue.offer(40);
        System.out.println("Queue: " + queue);
        System.out.println("Poll (FIFO): " + queue.poll());
        System.out.println("Peek: " + queue.peek());

        // Stack
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack peek: " + stack.peek());

        // HashSet
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 3, 2));
        System.out.println("HashSet (no duplicates): " + set);

        // TreeSet (sorted)
        Set<String> treeSet = new TreeSet<>(Arrays.asList("Zebra","Apple","Mango","Banana"));
        System.out.println("TreeSet (sorted): " + treeSet);

        // HashMap
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Ravi",   85);
        marks.put("Priya",  92);
        marks.put("Suresh", 78);
        marks.put("Geeta",  88);
        System.out.println("HashMap: " + marks);
        System.out.println("Priya's marks: " + marks.get("Priya"));
        marks.put("Ravi", 90); // update
        System.out.println("Ravi updated: " + marks.get("Ravi"));
        System.out.println("Contains key Geeta: " + marks.containsKey("Geeta"));

        // Iterate map
        System.out.println("All entries:");
        for (Map.Entry<String, Integer> e : marks.entrySet()) {
            System.out.println("  " + e.getKey() + " → " + e.getValue());
        }

        // TreeMap (sorted keys)
        Map<String, Integer> treeMap = new TreeMap<>(marks);
        System.out.println("TreeMap (sorted keys): " + treeMap);
    }

    // ===========================================================
    // 12. EXCEPTION HANDLING
    // ===========================================================
    static int safeDivide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Zero se divide nahi kar sakte!");
        return a / b;
    }

    static void exceptions() {
        System.out.println("\n===== 12. EXCEPTION HANDLING =====");

        // try-catch-finally
        try {
            int result = safeDivide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block hamesha chalta hai");
        }

        // Multiple exceptions
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getClass().getSimpleName());
        }

        try {
            int[] arr = new int[3];
            arr[10] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array bounds exception caught");
        }

        try {
            int Number = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: 'abc' int nahi hai");
        }

        // try-with-resources concept (simulated)
        System.out.println("Try-with-resources: AutoCloseable resources auto-close hote hain");

        // Custom exception
        try {
            validateAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }

    static void validateAge(int age) {
        if (age < 0 || age > 150)
            throw new IllegalArgumentException("Invalid age: " + age);
        System.out.println("Age valid: " + age);
    }

    // ===========================================================
    // 13. GENERICS
    // ===========================================================
    static class Pair<A, B> {
        A first;
        B second;

        Pair(A first, B second) {
            this.first  = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }

    static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];
        for (T val : arr) if (val.compareTo(max) > 0) max = val;
        return max;
    }

    static void generics() {
        System.out.println("\n===== 13. GENERICS =====");

        Pair<String, Integer> p1 = new Pair<>("Ravi", 95);
        Pair<Double, Boolean> p2 = new Pair<>(3.14, true);
        System.out.println("Pair 1: " + p1);
        System.out.println("Pair 2: " + p2);

        Integer[] ints    = {3, 7, 1, 9, 4};
        String[]  strs    = {"Mango", "Apple", "Zebra", "Banana"};
        System.out.println("Max int: "    + findMax(ints));
        System.out.println("Max string: " + findMax(strs));
    }

    // ===========================================================
    // 14. LAMBDA & STREAMS (Java 8+)
    // ===========================================================
    @FunctionalInterface
    interface MathOp {
        int operate(int a, int b);
    }

    static void lambdaStreams() {
        System.out.println("\n===== 14. LAMBDA & STREAMS =====");

        // Lambda expressions
        MathOp add  = (a, b) -> a + b;
        MathOp mul  = (a, b) -> a * b;
        MathOp mod  = (a, b) -> a % b;
        System.out.println("Lambda add(5,3)  = " + add.operate(5, 3));
        System.out.println("Lambda mul(5,3)  = " + mul.operate(5, 3));
        System.out.println("Lambda mod(10,3) = " + mod.operate(10, 3));

        // Streams
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // filter + collect
        List<Integer> evens = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
        System.out.println("Even numbers: " + evens);

        // map + collect
        List<Integer> squares = numbers.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // reduce
        int sumAll = numbers.stream()
            .reduce(0, Integer::sum);
        System.out.println("Sum 1-10: " + sumAll);

        // filter + map + reduce
        int sumEvenSquares = numbers.stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(n -> n * n)
            .sum();
        System.out.println("Sum of squares of evens: " + sumEvenSquares);

        // sorted + limit
        List<String> names = Arrays.asList("Zara","Alice","Meera","Bob","Priya");
        List<String> top3 = names.stream()
            .sorted()
            .limit(3)
            .collect(Collectors.toList());
        System.out.println("Top 3 sorted names: " + top3);

        // count
        long count = numbers.stream().filter(n -> n > 5).count();
        System.out.println("Numbers > 5: " + count);

        // forEach
        System.out.print("forEach: ");
        numbers.stream().filter(n -> n % 3 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
    }

    // ===========================================================
    // 15. ENUMS
    // ===========================================================
    enum Day {
        MON, TUE, WED, THU, FRI, SAT, SUN;

        boolean isWeekend() {
            return this == SAT || this == SUN;
        }
    }

    enum Planet {
        MERCURY(3.303e+23, 2.4397e6),
        VENUS  (4.869e+24, 6.0518e6),
        EARTH  (5.976e+24, 6.37814e6);

        private final double mass;
        private final double radius;
        static final double G = 6.67300E-11;

        Planet(double mass, double radius) {
            this.mass   = mass;
            this.radius = radius;
        }

        double surfaceGravity()   { return G * mass / (radius * radius); }
        double surfaceWeight(double otherMass) { return otherMass * surfaceGravity(); }
    }

    static void enums() {
        System.out.println("\n===== 15. ENUMS =====");

        Day today = Day.WED;
        System.out.println("Today: " + today);
        System.out.println("Is weekend: " + today.isWeekend());
        System.out.println("Ordinal: " + today.ordinal());

        for (Day d : Day.values()) {
            System.out.println(d + (d.isWeekend() ? " ← weekend" : ""));
        }

        double weight = 75.0;
        for (Planet p : Planet.values()) {
            System.out.printf("Weight on %-8s = %.2f N%n",
                              p, p.surfaceWeight(weight));
        }
    }

    // ===========================================================
    // MAIN — sab kuch call karo
    // ===========================================================
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║   JAVA BASIC CONCEPTS — FULL DEMO   ║");
        System.out.println("╚══════════════════════════════════════╝");

        dataTypes();
        operators();
        controlFlow();
        loops();
        arrays();
        strings();
        methodExamples();
        oopBasics();
        inheritance();
        interfacesAbstract();
        collections();
        exceptions();
        generics();
        lambdaStreams();
        enums();

        System.out.println("\n✅ Sab topics complete!");
        
    }
}