import CIE.*;
import SEE.*;

public class MainExam {
	public static void main(String args[]) {
		Student s1 = new Student(1, "Raja", 3);	
		Internals i1 = new Internals();
		External e1 = new External();
		
		i1.inputInternalMarks();
		e1.inputExternalMarks(); 
	}
}
