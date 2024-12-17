import java.util.Scanner;

public class Product {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        
        System.out.println("Product = " + product(a, b));
    }
    
    public static int product(int x, int y) {
        return x * y;
    }
}
