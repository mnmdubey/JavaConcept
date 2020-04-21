package oops_Concept_Part1;
/**
 * @author Manoranjan Dubey
 * Last Updated On: 21-Apr-2020
 * mail me at mnmdubey@gmail.com in case of any PR or query
 */
//===============================================================================

public class FunctionOrMethod {
	
	
	public static void main(String[] args) {
		
		FunctionOrMethod objName = new FunctionOrMethod();
		
		System.out.println("Lets call the method: justPrint ");
		objName.justPrint();
		System.out.println("+++++++++++++++++++++++++++++++");
		
		System.out.println("Lets call the method: temp ");
		int i1 = objName.temp();
		System.out.println("Output of Method is: "+i1);
		System.out.println("+++++++++++++++++++++++++++++++");
		
		System.out.println("Lets call the method: firstString ");
		String fStr = objName.firstString();
		System.out.println("Output of Method is: "+fStr);
		System.out.println("+++++++++++++++++++++++++++++++");
		
		System.out.println("Lets call the method: sumOfNum ");
		double sumOfVar = objName.sumOfNum(10.55, 9.55);
		System.out.println("Output of Method is: "+sumOfVar);
		System.out.println("+++++++++++++++++++++++++++++++");
		
		System.out.println("Lets call the method: sumOfNum ");
		String strResult = objName.strAndNum("Hello", "Deb");
		System.out.println("Output of Method is: "+strResult);
		System.out.println("+++++++++++++++++++++++++++++++");
	}
	
	public void justPrint(){
		System.out.println("Method Name: JustPrint");
		System.out.println("Nothing will be return as returrn type is void");
	}

	public int temp(){
		System.out.println("Method Name: temp");
		
		int a = 10;
		int b = 42;
		
		int c = a+b;
		
		return c;
	}
	
	public String firstString (){
		System.out.println("Method Name: firstString");
		String str = "This is my First String";
		
		return str;
		
	}
	
	public double sumOfNum(double dub1, double dub2){
		System.out.println("Method Name: sumOfNum");
		double sum = dub1 + dub2;
		
		return sum;
		
	}
	
	
	public String strAndNum(String s1, String s2)
	{
		System.out.println("Method Name: strAndNum");
//		String s1 = "Hello";
//		String s2 = "World";
		
		String s3 = s1+s2;
		
		return s3;
		
	}
	
}
