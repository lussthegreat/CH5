import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int a = 0;
        int b = 0;
        int c = 0;

        
        System.out.print("Enter an integer for a: ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            String invalidInput = scanner.next();
            System.out.println("Error: '" + invalidInput + "' is not an integer.");
            scanner.close();
            return; 
        }

       
        System.out.print("Enter an integer for b: ");
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        } else {
            String invalidInput = scanner.next();
            System.out.println("Error: '" + invalidInput + "' is not an integer.");
            scanner.close();
            return; 
        }

     
        System.out.print("Enter an integer for c: ");
        if (scanner.hasNextInt()) {
            c = scanner.nextInt();
        } else {
            String invalidInput = scanner.next();
            System.out.println("Error: '" + invalidInput + "' is not an integer.");
            scanner.close();
            return; 
        }

     
        if (a == 0) {
            System.out.println("Error: 'a' cannot be 0 because it would cause a division by zero.");
        } else {
            
            double discriminant = (b * b) - (4 * a * c);

            
            if (discriminant < 0) {
                System.out.println("There are no real solutions.");
            } else if (discriminant == 0) {
               
                double root = -b / (2.0 * a); 
                System.out.println("There is one solution: x = " + root);
            } else {
                
                double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
                System.out.println("There are two solutions:");
                System.out.println("Solution 1: x = " + root1);
                System.out.println("Solution 2: x = " + root2);
            }
        }

        scanner.close();
    }
}

