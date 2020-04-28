package otherJava_Concept;

//This is just like Constant
//It will not allow to Change

public class FinalConcept {
	
	public static void main(String[] args) {
		
		int i = 10;
		i = 20;
		i = 60;
		System.out.println("Most updated Number is: "+i);// will print the most current value
		System.out.println("------------------------------------------");
		final int EmpId = 198;
		// EmpId = 306; // This will NOT Allow as this is used as keyword "final"
		// EmpId = 509; // This will NOT Allow as this is used as keyword "final"
		System.out.println("final EmpId is: "+EmpId);// will print the most current value
		System.out.println("------------------------------------------");
		
		final String Emp_DOB = "01/01/2000";
		// Emp_DOB = "05/05/2002"; // This will NOT Allow as this is used as keyword "final"
		// Emp_DOB = "10/10/2006"; // This will NOT Allow as this is used as keyword "final"
		System.out.println("final Emp_DOB is: "+Emp_DOB);// will print the most current value
		System.out.println("------------------------------------------");
		String Emp_Mob = "9833696826";
		Emp_Mob = "8080705040"; // Allow to Update as this is NOT used as keyword "final"
		Emp_Mob = "6262727288"; // Allow to Update as this is NOT used as keyword "final"
		System.out.println("Most updated Mobile Number is: "+Emp_Mob);// will print the most current value
		System.out.println("------------------------------------------");
	}

}
