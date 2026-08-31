import java.util.Scanner;

public class InputStatement {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read a string
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Read an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Read a double
        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();
        
        // Read a boolean
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        
        // Display the input
        System.out.println("\n--- Your Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Student: " + isStudent);
        
        // Close the scanner
        scanner.close();
    }
}
