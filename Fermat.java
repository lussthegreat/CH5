import java.util.Scanner;
public class Fermat {
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	 System.out.print("Enter value for a: ");
        int a = in.nextInt();
        
        System.out.print("Enter value for b: ");
        int b = in.nextInt();
        
        System.out.print("Enter value for c: ");
        int c = in.nextInt();
        
        System.out.print("Enter value for n: ");
        int n = in.nextInt();

     
        checkFermat(a, b, c, n);
    }

    public static void checkFermat(int a, int b, int c, int n) {
        double aToTheN = Math.pow(a, n);
        double bToTheN = Math.pow(b, n);
        double cToTheN = Math.pow(c, n);

        if (n > 2 && (aToTheN + bToTheN == cToTheN)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }
    }
}


