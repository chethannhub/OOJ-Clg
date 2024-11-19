package SEE;
import java.util.*;

public class External {
    	int exMarks[] = new int[5];
	
	public void inputExternalMarks() {
		System.out.println("\nEnter the external marks");
		for(int i = 0; i<exMarks.length; i++) {
			System.out.print("Sub " + (i+1) +  " : ");
			
			Scanner sc = new Scanner(System.in);
			exMarks[i] = sc.nextInt();
		}
	}

}
