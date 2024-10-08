import java.util.*;

public class Student_sgpa {
    static String USN;
    static int credits[] = new int[8];
    static int marks[] = new int[8];

    Student_sgpa() {
        System.out.println("Enter your details: ");
    }

    static void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the USN: ");
        USN = sc.nextLine();
        System.out.println("Enter the credits and marks: ");
        for (int i = 0; i < 8; i++) {
            System.out.print("Credits for subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();
            System.out.print("Marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    static int sgpa() {
        int grade_points[] = new int[8];
        int sub_points[] = new int[8];
        int total_points = 0; 
        int total_credits = 0; 
        for (int i = 0; i < 8; i++) {
            if (marks[i] >= 90) {
                grade_points[i] = 10;
            } else if (marks[i] >= 80) {
                grade_points[i] = 9;
            } else if (marks[i] >= 70) {
                grade_points[i] = 8;
            } else if (marks[i] >= 60) {
                grade_points[i] = 7;
            } else if (marks[i] >= 50) {
                grade_points[i] = 6;
            } else if (marks[i] >= 40) {
                grade_points[i] = 5;
            } else {
                grade_points[i] = 0;
            }

            sub_points[i] = credits[i] * grade_points[i];
            total_points += sub_points[i];  
            total_credits += credits[i];    
        }

        if (total_credits == 0) return 0; 
        return total_points / total_credits; 
    }

    static void display() {

        System.out.println("\n\nUSN: " + USN);

        for (int i = 0; i < 8; i++) {
            System.out.println("\nCredits for subject " + (i + 1) + ": " + credits[i]);
            System.out.println("Marks for subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("\nSGPA: " + sgpa());
    }

    public static void main(String args[]) {
        accept();
        display();
    }
}
