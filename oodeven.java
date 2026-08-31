import java.util.Scanner;

public class oodeven {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Take input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an EVEN number");
        } else {
            System.out.println(number + " is an ODD number");
        }
        
        // Close the scanner
        scanner.close();
    }
}
