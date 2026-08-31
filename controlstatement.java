public class controlstatement {
    public static void main(String[] args) {
        
        // 1. IF-ELSE Statement
        System.out.println("=== IF-ELSE Statement ===");
        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }
        
        // 2. IF-ELSE IF-ELSE Statement
        System.out.println("\n=== IF-ELSE IF-ELSE Statement ===");
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        
        // 3. SWITCH Statement
        System.out.println("\n=== SWITCH Statement ===");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
        }
        
        // 4. FOR Loop
        System.out.println("\n=== FOR Loop ===");
        System.out.print("Numbers: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // 5. WHILE Loop
        System.out.println("\n=== WHILE Loop ===");
        int count = 1;
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        
        // 6. DO-WHILE Loop
        System.out.println("\n=== DO-WHILE Loop ===");
        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        } while (num <= 5);
        System.out.println();
        
        // 7. BREAK Statement
        System.out.println("\n=== BREAK Statement ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // Exit loop when i equals 6
            }
            System.out.print(i + " ");
        }
        System.out.println("\nLoop ended");
        
        // 8. CONTINUE Statement
        System.out.println("\n=== CONTINUE Statement ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip iteration when i equals 3
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // 9. NESTED IF
        System.out.println("\n=== NESTED IF ===");
        int number = 15;
        if (number > 0) {
            System.out.println("Number is positive");
            if (number % 2 == 0) {
                System.out.println("It is even");
            } else {
                System.out.println("It is odd");
            }
        }
        
        // 10. TERNARY Operator
        System.out.println("\n=== TERNARY Operator ===");
        int x = 20;
        String result = (x > 10) ? "x is greater than 10" : "x is less than or equal to 10";
        System.out.println(result);
    }
}
