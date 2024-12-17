import java.util.Scanner;

public class Add_Sub {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        
        System.out.println("Sum = " + add(a, b));
        System.out.println("Diff = " + sub(a, b));
    }
    
    public static int add(int x, int y) {
        return x + y;
    }
    
    public static int sub(int x, int y) {
        return x - y;
    }
}
