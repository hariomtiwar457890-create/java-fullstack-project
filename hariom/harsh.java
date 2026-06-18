package hariom;
// ================================================================
//  input.java - example 
// ================================================================

import java.util.*;
import java.io.*;

public class harsh {

    // ============================================================
    // SECTION 1: SCANNER CLASS — BASICS
    // Scanner sabse popular input class hai Java mein
    // ============================================================

    static void section1_ScannerBasics() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║  SECTION 1: SCANNER BASICS               ║");
        System.out.println("╚══════════════════════════════════════════╝");

        Scanner sc = new Scanner(System.in);

        // --- 1.1 String input ---
        System.out.println("\n--- 1.1 String Input ---");
        System.out.print("Apna naam likho: ");
        String name = sc.nextLine();   // poori line read karta hai (spaces ke saath)
        System.out.println("Tumhara naam hai: " + name);

        // --- 1.2 Integer input ---
        System.out.println("\n--- 1.2 Integer Input ---");
        System.out.print("Apni age likho: ");
        int age = sc.nextInt();
        System.out.println("Tumhari age hai: " + age + " saal");

        // --- 1.3 Double / Float input ---
        System.out.println("\n--- 1.3 Double Input ---");
        System.out.print("Apna GPA likho (jaise 8.5): ");
        double gpa = sc.nextDouble();
        System.out.println("Tumhara GPA hai: " + gpa);

        // --- 1.4 Long input ---
        System.out.println("\n--- 1.4 Long Input ---");
        System.out.print("Aadhaar number likho (12 digit): ");
        long aadhaar = sc.nextLong();
        System.out.println("Aadhaar: " + aadhaar);

        // --- 1.5 Character input ---
        System.out.println("\n--- 1.5 Character Input ---");
        System.out.print("Koi ek character likho: ");
        sc.nextLine(); // buffer clear
        char ch = sc.nextLine().charAt(0);
        System.out.println("Character: " + ch);

        // --- 1.6 Boolean input ---
        System.out.println("\n--- 1.6 Boolean Input ---");
        System.out.print("true ya false likho: ");
        boolean flag = sc.nextBoolean();
        System.out.println("Boolean value: " + flag);

        sc.close();
    }

    // ============================================================
    // SECTION 2: SCANNER — NEXT vs NEXTLINE
    // Ye common confusion hai beginners mein!
    // ============================================================

    static void section2_NextVsNextLine() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║  SECTION 2: next() vs nextLine()         ║");
        System.out.println("╚══════════════════════════════════════════╝");

        Scanner sc = new Scanner(System.in);

        System.out.println("\nnext() — sirf ek word read karta hai (space tak)");
        System.out.println("nextLine() — poori line read karta hai (Enter tak)");

        // --- 2.1 next() example ---
        System.out.println("\n--- 2.1 next() example ---");
        System.out.print("Koi ek word likho: ");
        String word = sc.next();
        System.out.println("next() se mila: '" + word + "'");

        sc.nextLine(); // leftover newline clear karo

        // --- 2.2 nextLine() after nextInt() — common bug fix ---
        System.out.println("\n--- 2.2 nextLine() after nextInt() BUG FIX ---");
        System.out.print("Ek number likho: ");
        int num = sc.nextInt();
        sc.nextLine(); // IMPORTANT! nextInt ke baad ye likhna zaroori hai

        System.out.print("Ab poora sentence likho: ");
        String sentence = sc.nextLine();
        System.out.println("Number: " + num);
        System.out.println("Sentence: " + sentence);

        // --- 2.3 Multiple words on same line ---
        System.out.println("\n--- 2.3 Multiple Words --- ");
        System.out.print("First aur Last name likho (space se alag): ");
        String firstName = sc.next();
        String lastName  = sc.next();
        System.out.println("First: " + firstName + ", Last: " + lastName);

        sc.close();
    }

    // ============================================================
    // SECTION 3: MULTIPLE INPUTS — SAME LINE
    // ============================================================

    static void section3_MultipleInputs() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║  SECTION 3: MULTIPLE INPUTS              ║");
        System.out.println("╚══════════════════════════════════════════╝");

        Scanner sc = new Scanner(System.in);

        // --- 3.1 Multiple int on same line ---
        System.out.println("\n--- 3.1 Same line mein 3 numbers ---");
        System.out.print("3 numbers likho (space se alag): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Sum = " + (a + b + c));
        System.out.println("Average = " + (a + b + c) / 3.0);

        // --- 3.2 Name and age on same line ---
        System.out.println("\n--- 3.2 Name aur Age same line ---");
        System.out.print("Naam aur age likho (space se): ");
        String name = sc.next();
        int    age  = sc.nextInt();
        System.out.println(name + " ki age hai " + age + " saal");

        // --- 3.3 Rectangle dimensions ---
        System.out.println("\n--- 3.3 Rectangle ka area aur perimeter ---");
        System.out.print("Length aur Width do: ");
        double length = sc.nextDouble();
        double width  = sc.nextDouble();
        System.out.printf("Area      = %.2f%n", length * width);
        System.out.printf("Perimeter = %.2f%n", 2 * (length + width));

        sc.close();
    }

    // ============================================================
    // SECTION 4: ARRAY INPUT
    // ============================================================

    static void section4_ArrayInput() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║  SECTION 4: ARRAY INPUT                  ║");
        System.out.println("╚══════════════════════════════════════════╝");

        Scanner sc = new Scanner(System.in);

        // --- 4.1 Integer array ---
        System.out.println("\n--- 4.1 Integer Array ---");
        System.out.print("Array ki size batao: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println(n + " numbers likho (ek-ek karke):");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        // Print array
        System.out.print("Tumhara array: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        // Max, Min, Sum
        int max = arr[0], min = arr[0], sum = 0;
        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
            sum += x;
        }
        System.out.println("Maximum  = " + max);
        System.out.println("Minimum  = " + min);
        System.out.println("Sum      = " + sum);
        System.out.printf("Average  = %.2f%n", (double) sum / n);

        // --- 4.2 String array ---
        System.out.println("\n--- 4.2 String Array ---");
        System.out.print("Kitne naam enter karne hain? ");
        int count = sc.nextInt();
        sc.nextLine(); // buffer clear

        String[] names = new String[count];
        System.out.println(count + " naam likho:");
        for (int i = 0; i < count; i++) {
            System.out.print("Name[" + i + "]: ");
            names[i] = sc.nextLine();
        }

        System.out.println("\nSaare naam:");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }

        // Sort karo
        Arrays.sort(names);
        System.out.println("\nAlphabetical order mein:");
        for (String nm : names) System.out.println("  - " + nm);

        // --- 4.3 2D Matrix input ---
        System.out.println("\n--- 4.3 2D Matrix Input ---");
        System.out.print("Matrix ke rows batao: ");
        int rows = sc.nextInt();
        System.out.print("Matrix ke columns batao: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Matrix ke " + (rows * cols) + " elements likho:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix print:");
        for (int[] row : matrix) {
            for (int val : row) System.out.printf("%5d", val);
            System.out.println();
        }

        // Row sums
        System.out.println("\nRow sums:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) rowSum += matrix[i][j];
            System.out.println("Row " + i + " sum = " + rowSum);
        }

        sc.close();
    }

    // ============================================================
    // SECTION 5: STRING INPUT PROCESSING
    // ============================================================

    static void section5_StringProcessing() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║  SECTION 5: STRING INPUT PROCESSING      ║");
        System.out.println("╚══════════════════════════════════════════╝");

        Scanner sc = new Scanner(System.in);

        // --- 5.1 Word count in a sentence ---
        System.out.println("\n--- 5.1 Sentence mein kitne words? ---");
        System.out.print("Ek sentence likho: ");
        String sentence = sc.nextLine();
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Words ki sankhya: " + words.length);
        System.out.println("Characters (spaces ke saath): " + sentence.length());
        System.out.println("Characters (bina spaces): " + sentence.replace(" ", "").length());

        // --- 5.2 Reverse a string ---
        System.out.println("\n--- 5.2 String Reverse ---");
        System.out.print("Koi word ya sentence likho: ");
        String input = sc.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Original : " + input);
        System.out.println("Reversed : " + reversed);
        System.out.println("Palindrome? " + (input.equalsIgnoreCase(reversed) ? "Haan!" : "Nahi"));

        // --- 5.3 Vowel/Consonant count ---
        System.out.println("\n--- 5.3 Vowels aur Consonants count ---");
        System.out.print("Ek sentence likho: ");
        String s = sc.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels     : " + vowels);
        System.out.println("Consonants : " + consonants);

        // --- 5.4 Count specific word ---
        System.out.println("\n--- 5.4 Word frequency ---");
        System.out.print("Ek sentence likho: ");
        String para = sc.nextLine().toLowerCase();
        System.out.print("Konsa word dhundhna hai? ");
        String searchWord = sc.nextLine().toLowerCase();
        int freq = 0;
        for (String w : para.split("\\s+")) {
            if (w.equals(searchWord)) freq++;
        }
        System.out.println("'" + searchWord + "' " + freq + " baar aaya");

        // --- 5.5 String to int conversion ---
        System.out.println("\n--- 5.5 String se Number Convert ---");
        System.out.print("Ek number string mein likho (jaise '42'): ");
        String numStr = sc.nextLine();
        try {
            int parsedInt = Integer.parseInt(numStr);
            System.out.println("Parsed int   : " + parsedInt);
            System.out.println("Uska square  : " + (parsedInt * parsedInt));
        } catch (NumberFormatException e) {
            System.out.println("Yeh valid number nahi hai!");
        }

        sc.close();
    }

    // ============================================================
    // SECTION 6: LOOPS + INPUT COMBINATIONS
    // ============================================================

    static void section6_LoopsWithInput() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║  SECTION 6: LOOPS + INPUT                ║");
        System.out.println("╚══════════════════════════════════════════╝");

        Scanner sc = new Scanner(System.in);

        // --- 6.1 Menu-driven loop ---
        System.out.println("\n--- 6.1 Menu-Driven Program ---");
        int choice;
        do {
            System.out.println("\n=== CALCULATOR MENU ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Apna choice do (1-5): ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Pehla number: ");
                double x = sc.nextDouble();
                System.out.print("Doosra number: ");
                double y = sc.nextDouble();

                switch (choice) {
                    case 1: System.out.println("Result = " + (x + y)); break;
                    case 2: System.out.println("Result = " + (x - y)); break;
                    case 3: System.out.println("Result = " + (x * y)); break;
                    case 4:
                        if (y != 0) System.out.printf("Result = %.4f%n", x / y);
                        else System.out.println("Division by zero nahi kar sakte!");
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice! 1-5 ke beech likho.");
            }

        } while (choice != 5);
        System.out.println("Calculator band ho gaya.");

        // --- 6.2 Sum until user stops ---
        System.out.println("\n--- 6.2 Jab tak -1 na likho, numbers add karta rahega ---");
        int total = 0, cnt = 0;
        System.out.println("Numbers likho (-1 likhne par band hoga):");
        while (true) {
            System.out.print("Number: ");
            int val = sc.nextInt();
            if (val == -1) break;
            total += val;
            cnt++;
        }
        System.out.println("Tune " + cnt + " numbers likhe.");
        System.out.println("Total sum = " + total);
        if (cnt > 0) System.out.printf("Average  = %.2f%n", (double) total / cnt);

        // --- 6.3 Student grade entry ---
        System.out.println("\n--- 6.3 Student Marks Entry ---");
        System.out.print("Kitne students? ");
        int students = sc.nextInt();
        sc.nextLine();

        int passCount = 0, failCount = 0;
        double totalMarks = 0;

        for (int i = 1; i <= students; i++) {
            System.out.println("\nStudent " + i + ":");
            System.out.print("  Naam: ");
            String sName = sc.nextLine();
            System.out.print("  Marks (0-100): ");
            int marks = sc.nextInt();
            sc.nextLine();

            totalMarks += marks;
            String grade;
            if      (marks >= 90) grade = "A+";
            else if (marks >= 80) grade = "A";
            else if (marks >= 70) grade = "B";
            else if (marks >= 60) grade = "C";
            else if (marks >= 40) grade = "D (Pass)";
            else                  grade = "F (Fail)";

            if (marks >= 40) passCount++;
            else             failCount++;

            System.out.println("  " + sName + " → " + marks + "/100 → Grade: " + grade);
        }

        System.out.println("\n=== CLASS RESULT ===");
        System.out.printf("Class Average : %.2f%n", totalMarks / students);
        System.out.println("Pass          : " + passCount);
        System.out.println("Fail          : " + failCount);

        sc.close();
    }

    // ============================================================
    // SECTION 7: INPUT VALIDATION
    // ============================================================

    static void section7_InputValidation() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║  SECTION 7: INPUT VALIDATION             ║");
        System.out.println("╚══════════════════════════════════════════╝");

        Scanner sc = new Scanner(System.in);

        // --- 7.1 Validate age ---
        System.out.println("\n--- 7.1 Age Validation ---");
        int age = -1;
        while (age < 0 || age > 150) {
            System.out.print("Valid age do (0-150): ");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                if (age < 0 || age > 150)
                    System.out.println("Error: Age 0-150 ke beech honi chahiye!");
            } else {
                System.out.println("Error: Sirf number likho!");
                sc.next(); // invalid token consume karo
            }
        }
        System.out.println("Valid age: " + age);

        // --- 7.2 Validate marks ---
        System.out.println("\n--- 7.2 Marks Validation (0-100) ---");
        double marks = -1;
        while (marks < 0 || marks > 100) {
            System.out.print("Marks do (0-100): ");
            if (sc.hasNextDouble()) {
                marks = sc.nextDouble();
                if (marks < 0 || marks > 100)
                    System.out.println("Error: Marks 0-100 ke beech hone chahiye!");
            } else {
                System.out.println("Error: Sirf number likho!");
                sc.next();
            }
        }
        System.out.println("Valid marks: " + marks);

        // --- 7.3 Validate Y/N input ---
        System.out.println("\n--- 7.3 Y/N Input Validation ---");
        String yn = "";
        while (!yn.equalsIgnoreCase("Y") && !yn.equalsIgnoreCase("N")) {
            System.out.print("Continue karna chahte ho? (Y/N): ");
            yn = sc.next();
            if (!yn.equalsIgnoreCase("Y") && !yn.equalsIgnoreCase("N"))
                System.out.println("Error: Sirf Y ya N likho!");
        }
        System.out.println("Tumne choose kiya: " + yn.toUpperCase());

        // --- 7.4 Validate positive number ---
        System.out.println("\n--- 7.4 Positive Number Validation ---");
        int positiveNum = -1;
        while (positiveNum <= 0) {
            System.out.print("Ek positive number do: ");
            if (sc.hasNextInt()) {
                positiveNum = sc.nextInt();
                if (positiveNum <= 0)
                    System.out.println("Error: Number positive hona chahiye!");
            } else {
                System.out.println("Error: Sirf integer likho!");
                sc.next();
            }
        }
        System.out.println("Valid positive number: " + positiveNum);

        // --- 7.5 Try-catch based validation ---
        System.out.println("\n--- 7.5 Try-Catch Validation ---");
        sc.nextLine();
        int parsedNum = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Ek integer string mein do: ");
            String inp = sc.nextLine();
            try {
                parsedNum = Integer.parseInt(inp.trim());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("'" + inp + "' valid integer nahi hai! Dobara try karo.");
            }
        }
        System.out.println("Parsed number: " + parsedNum);

        sc.close();
    }

    // ============================================================
    // SECTION 8: BUFFEREDREADER — Fast Input
    // Competitive programming mein use hota hai
    // ============================================================

    static void section8_BufferedReader() throws IOException {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║  SECTION 8: BUFFEREDREADER               ║");
        System.out.println("╚══════════════════════════════════════════╝");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nBufferedReader Scanner se zyada fast hota hai!");
        System.out.println("Competitive programming mein prefer kiya jata hai.");

        // --- 8.1 String input ---
        System.out.println("\n--- 8.1 String Input via BufferedReader ---");
        System.out.print("Apna naam likho: ");
        String name = br.readLine();
        System.out.println("Hello, " + name + "!");

        // --- 8.2 Integer input ---
        System.out.println("\n--- 8.2 Integer Input ---");
        System.out.print("Ek number do: ");
        int num = Integer.parseInt(br.readLine().trim());
        System.out.println("Number: " + num);
        System.out.println("Square: " + (num * num));

        // --- 8.3 Multiple numbers on same line ---
        System.out.println("\n--- 8.3 Same line pe 2 numbers (space se alag) ---");
        System.out.print("Do numbers do: ");
        String[] parts = br.readLine().trim().split(" ");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x * y = " + (x * y));

        // --- 8.4 Array input via BufferedReader ---
        System.out.println("\n--- 8.4 Array Input ---");
        System.out.print("Array ki size: ");
        int n = Integer.parseInt(br.readLine().trim());

        System.out.println("Same line pe " + n + " numbers do (space se alag):");
        String[] tokens = br.readLine().trim().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(tokens[i]);

        System.out.print("Array: ");
        for (int v : arr) System.out.print(v + " ");
        System.out.println();

        // Sort and display
        Arrays.sort(arr);
        System.out.print("Sorted: ");
        for (int v : arr) System.out.print(v + " ");
        System.out.println();

        // --- 8.5 StreamTokenizer (fastest) ---
        System.out.println("\n--- 8.5 StreamTokenizer (competitive prog. style) ---");
        System.out.println("(Ye sabse fast input method hai Java mein)");
        StreamTokenizer st = new StreamTokenizer(
            new BufferedReader(new InputStreamReader(System.in))
        );

        System.out.print("2 numbers do: ");
        st.nextToken(); double p = st.nval;
        st.nextToken(); double q = st.nval;
        System.out.println("p=" + (int)p + ", q=" + (int)q);
        System.out.println("p + q = " + (int)(p + q));
    }

    // ============================================================
    // SECTION 9: SCANNER FROM STRING / FILE
    // ============================================================

    static void section9_ScannerFromString() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║  SECTION 9: SCANNER FROM STRING          ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // --- 9.1 Scanner on a String ---
        System.out.println("\n--- 9.1 Scanner from String ---");
        String data = "Ravi 20 9.2 Delhi";
        Scanner sc = new Scanner(data);
        String sName  = sc.next();
        int    sAge   = sc.nextInt();
        double sGpa   = sc.nextDouble();
        String sCity  = sc.next();
        System.out.println("Name : " + sName);
        System.out.println("Age  : " + sAge);
        System.out.println("GPA  : " + sGpa);
        System.out.println("City : " + sCity);
        sc.close();

        // --- 9.2 Parse CSV string ---
        System.out.println("\n--- 9.2 Parse CSV String ---");
        String csv = "101,Priya,85,Mumbai\n102,Arjun,92,Delhi\n103,Sneha,78,Pune";
        Scanner csvSc = new Scanner(csv);
        System.out.printf("%-5s %-10s %-6s %-10s%n", "ID", "Name", "Marks", "City");
        System.out.println("-".repeat(35));
        while (csvSc.hasNextLine()) {
            String line = csvSc.nextLine();
            String[] fields = line.split(",");
            System.out.printf("%-5s %-10s %-6s %-10s%n",
                              fields[0], fields[1], fields[2], fields[3]);
        }
        csvSc.close();

        // --- 9.3 Parse delimited data ---
        System.out.println("\n--- 9.3 Custom Delimiter Scanner ---");
        String items = "Apple:50:kg;Banana:30:dozen;Mango:80:kg";
        Scanner delSc = new Scanner(items).useDelimiter(";");
        double billTotal = 0;
        System.out.printf("%-10s %-8s %-8s%n", "Item", "Price", "Unit");
        System.out.println("-".repeat(28));
        while (delSc.hasNext()) {
            String[] parts = delSc.next().split(":");
            System.out.printf("%-10s %-8s %-8s%n", parts[0], "₹" + parts[1], parts[2]);
            billTotal += Double.parseDouble(parts[1]);
        }
        System.out.println("-".repeat(28));
        System.out.println("Total: ₹" + billTotal);
        delSc.close();
    }

    // ============================================================
    // SECTION 10: PRACTICAL PROJECTS WITH INPUT
    // ============================================================

    static void section10_Projects() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║  SECTION 10: PRACTICAL PROJECTS          ║");
        System.out.println("╚══════════════════════════════════════════╝");

        Scanner sc = new Scanner(System.in);

        // --- 10.1 Simple Bank Account ---
        System.out.println("\n--- 10.1 Bank Account Simulation ---");
        System.out.print("Account holder naam: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance (Rs): ");
        double balance = sc.nextDouble();

        System.out.println("\n=== " + holder + " ka Account ===");
        System.out.printf("Starting Balance: ₹%.2f%n", balance);

        int txnChoice;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            txnChoice = sc.nextInt();

            switch (txnChoice) {
                case 1:
                    System.out.print("Amount deposit karo: ₹");
                    double dep = sc.nextDouble();
                    if (dep > 0) {
                        balance += dep;
                        System.out.printf("✓ ₹%.2f deposit hua. New balance: ₹%.2f%n", dep, balance);
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;
                case 2:
                    System.out.print("Amount withdraw karo: ₹");
                    double wd = sc.nextDouble();
                    if (wd > 0 && wd <= balance) {
                        balance -= wd;
                        System.out.printf("✓ ₹%.2f withdraw hua. New balance: ₹%.2f%n", wd, balance);
                    } else if (wd > balance) {
                        System.out.println("Insufficient funds!");
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;
                case 3:
                    System.out.printf("Current Balance: ₹%.2f%n", balance);
                    break;
                case 4:
                    System.out.println("Thank you, " + holder + "!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (txnChoice != 4);

        // --- 10.2 Quiz Game ---
        System.out.println("\n--- 10.2 Mini Quiz Game ---");
        String[][] questions = {
            {"Java ka full form kya hai?",
             "A. Just Another Virtual Application  B. Just Another Version of Application\n" +
             "C. Java is not an acronym  D. Java Application Version Architecture",
             "C"},
            {"Java kab release hua?",
             "A. 1991  B. 1995  C. 1998  D. 2000",
             "B"},
            {"System.out.println() kya karta hai?",
             "A. Input leta hai  B. Kuch nahi  C. Output print karta hai  D. Loop chalata hai",
             "C"},
            {"Java mein default int value kya hai?",
             "A. null  B. 1  C. undefined  D. 0",
             "D"},
            {"String class konse package mein hai?",
             "A. java.io  B. java.string  C. java.lang  D. java.util",
             "C"}
        };

        int score = 0;
        sc.nextLine(); // buffer clear

        System.out.println("\nWelcome to Java Quiz! 5 questions hain.\n");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ". " + questions[i][0]);
            System.out.println(questions[i][1]);
            System.out.print("Jawab do (A/B/C/D): ");
            String ans = sc.nextLine().trim().toUpperCase();
            if (ans.equals(questions[i][2])) {
                System.out.println("✓ Correct!\n");
                score++;
            } else {
                System.out.println("✗ Wrong! Sahi answer: " + questions[i][2] + "\n");
            }
        }

        System.out.println("=== QUIZ RESULT ===");
        System.out.println("Score: " + score + "/5");
        if      (score == 5) System.out.println("Outstanding! Perfect score!");
        else if (score >= 3) System.out.println("Bahut badhiya! Well done!");
        else if (score >= 2) System.out.println("Theek hai. Aur practice karo!");
        else                  System.out.println("Mehnat karo. Java padho!");

        // --- 10.3 Number Guessing Game ---
        System.out.println("\n--- 10.3 Number Guessing Game ---");
        Random rand   = new Random();
        int secret    = rand.nextInt(100) + 1;  // 1 to 100
        int attempts  = 0;
        int maxTries  = 7;
        boolean won   = false;

        System.out.println("Main sooch raha hoon 1-100 ke beech ek number...");
        System.out.println("Tumhare paas " + maxTries + " chances hain!\n");

        while (attempts < maxTries) {
            System.out.print("Guess #" + (attempts + 1) + ": ");
            int guess = sc.nextInt();
            attempts++;

            if (guess == secret) {
                System.out.println("BILKUL SAHI! " + attempts + " attempts mein guess kiya!");
                won = true;
                break;
            } else if (guess < secret) {
                System.out.println("Zyada bolo! (Hint: aur bada number)");
            } else {
                System.out.println("Kam karo! (Hint: aur chhota number)");
            }
            System.out.println("Bachay hue chances: " + (maxTries - attempts));
        }

        if (!won) {
            System.out.println("Haha! Tum haar gaye. Number tha: " + secret);
        }

        sc.close();
    }

    // ============================================================
    // SECTION 11: COMMON PATTERNS & ALGORITHMS WITH INPUT
    // ============================================================

    static void section11_AlgorithmsWithInput() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║  SECTION 11: ALGORITHMS WITH INPUT       ║");
        System.out.println("╚══════════════════════════════════════════╝");

        Scanner sc = new Scanner(System.in);

        // --- 11.1 Fibonacci upto N ---
        System.out.println("\n--- 11.1 Fibonacci Series ---");
        System.out.print("Fibonacci terms kitne chahiye? ");
        int fibN = sc.nextInt();
        System.out.print("Fibonacci(" + fibN + "): ");
        long f1 = 0, f2 = 1;
        for (int i = 0; i < fibN; i++) {
            System.out.print(f1 + " ");
            long next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        System.out.println();

        // --- 11.2 Prime check ---
        System.out.println("\n--- 11.2 Prime Number Check ---");
        System.out.print("Number do: ");
        int primeNum = sc.nextInt();
        boolean prime = primeNum > 1;
        for (int i = 2; i * i <= primeNum; i++) {
            if (primeNum % i == 0) { prime = false; break; }
        }
        System.out.println(primeNum + (prime ? " ek prime number hai!" : " prime nahi hai."));

        // --- 11.3 Primes in range ---
        System.out.println("\n--- 11.3 Range mein prime numbers ---");
        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End  : ");
        int end = sc.nextInt();
        System.out.print("Primes between " + start + " and " + end + ": ");
        for (int i = start; i <= end; i++) {
            boolean p = i > 1;
            for (int j = 2; j * j <= i; j++)
                if (i % j == 0) { p = false; break; }
            if (p) System.out.print(i + " ");
        }
        System.out.println();

        // --- 11.4 Palindrome check ---
        System.out.println("\n--- 11.4 Palindrome Check ---");
        sc.nextLine();
        System.out.print("Word ya number likho: ");
        String palStr = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        String palRev = new StringBuilder(palStr).reverse().toString();
        System.out.println(palStr + (palStr.equals(palRev) ? " palindrome hai!" : " palindrome nahi hai."));

        // --- 11.5 Factorial ---
        System.out.println("\n--- 11.5 Factorial ---");
        System.out.print("Number do (0-20): ");
        int factN = sc.nextInt();
        long fact = 1;
        for (int i = 2; i <= factN; i++) fact *= i;
        System.out.println(factN + "! = " + fact);

        // --- 11.6 Armstrong Number ---
        System.out.println("\n--- 11.6 Armstrong Number ---");
        System.out.print("Number do: ");
        int armN = sc.nextInt();
        int temp = armN, digits = String.valueOf(armN).length();
        long armSum = 0;
        while (temp > 0) {
            int dig = temp % 10;
            armSum += (long) Math.pow(dig, digits);
            temp /= 10;
        }
        System.out.println(armN + (armN == armSum ? " Armstrong number hai!" : " Armstrong nahi hai."));

        // --- 11.7 GCD and LCM ---
        System.out.println("\n--- 11.7 GCD aur LCM ---");
        System.out.print("Pehla number: ");
        int gcdA = sc.nextInt();
        System.out.print("Doosra number: ");
        int gcdB = sc.nextInt();
        int gcdResult = gcd(gcdA, gcdB);
        int lcmResult = (gcdA / gcdResult) * gcdB;
        System.out.println("GCD(" + gcdA + "," + gcdB + ") = " + gcdResult);
        System.out.println("LCM(" + gcdA + "," + gcdB + ") = " + lcmResult);

        // --- 11.8 Binary/Decimal conversion ---
        System.out.println("\n--- 11.8 Decimal to Binary ---");
        System.out.print("Decimal number do: ");
        int decNum = sc.nextInt();
        System.out.println(decNum + " ka binary: " + Integer.toBinaryString(decNum));
        System.out.println(decNum + " ka octal : " + Integer.toOctalString(decNum));
        System.out.println(decNum + " ka hex   : " + Integer.toHexString(decNum).toUpperCase());

        sc.close();
    }

    // Helper: GCD (Euclidean Algorithm)
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // ============================================================
    // SECTION 12: PATTERN PRINTING WITH INPUT
    // ============================================================

    static void section12_Patterns() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║  SECTION 12: PATTERNS WITH INPUT         ║");
        System.out.println("╚══════════════════════════════════════════╝");

        Scanner sc = new Scanner(System.in);
        System.out.print("Pattern ki rows batao: ");
        int n = sc.nextInt();

        // Pattern 1: Right Triangle
        System.out.println("\nPattern 1 — Right Triangle (*):");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }

        // Pattern 2: Inverted Triangle
        System.out.println("\nPattern 2 — Inverted Triangle:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }

        // Pattern 3: Number Triangle
        System.out.println("\nPattern 3 — Number Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }

        // Pattern 4: Pyramid
        System.out.println("\nPattern 4 — Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }

        // Pattern 5: Diamond
        System.out.println("\nPattern 5 — Diamond:");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }

        // Pattern 6: Floyd's Triangle
        System.out.println("\nPattern 6 — Floyd's Triangle:");
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(num++ + " ");
            System.out.println();
        }

        // Pattern 7: Pascal's Triangle
        System.out.println("\nPattern 7 — Pascal's Triangle:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) System.out.print(" ");
            long coef = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(coef + " ");
                coef = coef * (i - j) / (j + 1);
            }
            System.out.println();
        }

        sc.close();
    }

    // ============================================================
    // MAIN METHOD — Sab sections call karo
    // ============================================================

    public static void main(String[] args) throws IOException {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   INPUT EXAMPLES — JAVA COMPLETE GUIDE      ║");
        System.out.println("║   12 Sections | 1000+ Lines | Hindi Notes    ║");
        System.out.println("╚══════════════════════════════════════════════╝");

        Scanner sc = new Scanner(System.in);

        System.out.println("\nKonsa section run karna hai?");
        System.out.println("1.  Scanner Basics");
        System.out.println("2.  next() vs nextLine()");
        System.out.println("3.  Multiple Inputs");
        System.out.println("4.  Array Input");
        System.out.println("5.  String Processing");
        System.out.println("6.  Loops + Input");
        System.out.println("7.  Input Validation");
        System.out.println("8.  BufferedReader");
        System.out.println("9.  Scanner from String");
        System.out.println("10. Practical Projects (Bank, Quiz, Game)");
        System.out.println("11. Algorithms with Input");
        System.out.println("12. Patterns");
        System.out.println("0.  Sab ek saath (All sections)");
        System.out.print("\nChoice do (0-12): ");

        int choice = sc.nextInt();
        sc.close();

        switch (choice) {
            case 1  -> section1_ScannerBasics();
            case 2  -> section2_NextVsNextLine();
            case 3  -> section3_MultipleInputs();
            case 4  -> section4_ArrayInput();
            case 5  -> section5_StringProcessing();
            case 6  -> section6_LoopsWithInput();
            case 7  -> section7_InputValidation();
            case 8  -> section8_BufferedReader();
            case 9  -> section9_ScannerFromString();
            case 10 -> section10_Projects();
            case 11 -> section11_AlgorithmsWithInput();
            case 12 -> section12_Patterns();
            case 0  -> {
                section1_ScannerBasics();
                section2_NextVsNextLine();
                section3_MultipleInputs();
                section4_ArrayInput();
                section5_StringProcessing();
                section6_LoopsWithInput();
                section7_InputValidation();
                section8_BufferedReader();
                section9_ScannerFromString();
                section10_Projects();
                section11_AlgorithmsWithInput();
                section12_Patterns();
            }
            default -> System.out.println("Invalid choice!");
        }

        System.out.println("\n✅ Done! InputExamples.java complete hai.");
    }
}