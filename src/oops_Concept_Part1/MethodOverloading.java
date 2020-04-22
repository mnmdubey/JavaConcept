package oops_Concept_Part1;
/**
 * @author Manoranjan Dubey
 * Last Updated On: 21-Apr-2020
 * mail me at mnmdubey@gmail.com in case of any PR or query
 */
//==============================================================================
public class MethodOverloading {
	
	public static void main(String[] args) {
		MethodOverloading objMOL = new MethodOverloading();
		System.out.println("This is main Method - In this will see Method Overloading cocncept");
		
		objMOL.addNum();
		objMOL.addNum(10, 20);
		objMOL.addNum(100, 200); //output will NOT be 300 as when it runs it will take value from Method where defined and that value is 10 and 20
		objMOL.addNum(10, 20, 30);
		
		System.out.println("==THE END, Thank you=====");
	}
	
	public void addNum (){
		System.out.println("This Method - addNum: is just to add number");
	}
	
	public int addNum (int a, int b){
		a = 10;
		b = 20;
		int c = a + b;
		System.out.println("This Method - addNum: is just to add TWO numbers");
		System.out.println("This Method - addNum: "+c);
		return c;
	}
	
	public int addNum (int n1, int n2, int n3){
		int sum = n1 + n2 + n3;
		System.out.println("This Method - addNum: is just to add TWO numbers");
		System.out.println("This Method - addNum: "+sum);
		return sum;
	}
}
//====TAKE AWAY FROM THIS=============================================================
/**
* method can not be duplicated (Can not create with same signature)
* more than one method can be created with different Signature
* While calling the Method, System may confused, which method should be called.
* This is Method Overloading Concept.* 
*/