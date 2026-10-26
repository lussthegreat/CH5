import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1 = 0;
        int side2 = 0;
        int side3 = 0;    
        System.out.print("Enter an integer for side 1: ");
        if (scanner.hasNextInt()) {
            side1 = scanner.nextInt();
        } else {
            String invalidInput = scanner.next();
            System.out.println("Error: '" + invalidInput + "' is not a valid integer.");
            scanner.close();
            return; 
        }     
        System.out.print("Enter an integer for side 2: ");
        if (scanner.hasNextInt()) {
            side2 = scanner.nextInt();
        } else {
            String invalidInput = scanner.next();
            System.out.println("Error: '" + invalidInput + "' is not a valid integer.");
            scanner.close();
            return;
        }
     
        System.out.print("Enter an integer for side 3: ");
        if (scanner.hasNextInt()) {
            side3 = scanner.nextInt();
        } else {
            String invalidInput = scanner.next();
            System.out.println("Error: '" + invalidInput + "' is not a valid integer.");
            scanner.close();
            return;
        }
     
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Error: All side lengths must be greater than zero.");
        } else {
            
            if (side1 > (side2 + side3) || side2 > (side1 + side3) || side3 > (side1 + side2)) {
                System.out.println("You cannot form a triangle.");
            } else {
                System.out.println("You can form a triangle.");
            }
        }

        scanner.close();
    }
}
