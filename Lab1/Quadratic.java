import java.util.Scanner;

public class Quadratic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = (b * b) - (4 * a * c); 
        if (d < 0) {
            System.out.println("There are no real solutions.");
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(d)) / (2.0 * a);

            System.out.println("The real solutions are: " + x1 + ", " + x2);
        }
    }
}
