package oops_Concept_Part1;
/**
 * @author Manoranjan Dubey
 * Last Updated On: 21-Apr-2020
 * mail me at mnmdubey@gmail.com in case of any PR or query
 */
//================================================================================
public class GlobalAndLocalVar {
	static int int1 = 2020; 
	String str1 = "Global Variable";
	
	public static void main(String[] args) {
		
		GlobalAndLocalVar obj = new GlobalAndLocalVar();
		
		int int1 = 2018;
		String str1 = "Local Variable";
		
		System.out.println("Local Variable int1: "+int1);
		System.out.println("Local Variable str1: "+str1);
		
		//int gv = obj.int1;
		System.out.println("Gobal Variable: "+obj.int1);
		System.out.println("Gobal Variable: "+obj.str1);
		
		obj.sum();
	}

	
	public int sum(){
		//int int1 = 100;
		System.out.println("Local Variable from method 'sum' "+ int1);
		System.out.println("Method >> sum");
		int c = int1 + 500;
		System.out.println("Here vaiable is: " +int1+ " and used from Gloabal and sum is: "+c);
		return c;
	}
}

