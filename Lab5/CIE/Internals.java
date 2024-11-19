package CIE;
import java.util.*;

public class Internals {
	int inMarks[] = new int[5];
	
	public void inputInternalMarks() {
		System.out.println("\nEnter the internal marks");
		for(int i = 0; i<inMarks.length; i++) {
			System.out.print("Sub " + (i+1) +  " : ");
			
			Scanner sc = new Scanner(System.in);
			inMarks[i] = sc.nextInt();
		}
	}
}
