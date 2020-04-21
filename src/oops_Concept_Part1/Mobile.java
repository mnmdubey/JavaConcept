package oops_Concept_Part1;
/**
 * @author Manoranjan Dubey
 * Last Updated On: 21-Apr-2020
 * mail me at mnmdubey@gmail.com in case of any PR or query
 */
//===============================================================================

public class Mobile {
	
	String Comp;
	int Model;
	int Price;
	
	public static void main(String[] args) {
		
		// new Mobile() - This is Object
		// new keyword is use to create object
		// mobile1, mobile2, and mobile3 is object reference variable or object name
		Mobile mobile1 = new Mobile(); 
		Mobile mobile2 = new Mobile();
		Mobile mobile3 = new Mobile();
		
		mobile1.Comp = "iPhone";
		mobile1.Model = 2019;
		mobile1.Price = 50000;
		
		mobile2.Comp = "RedMi";
		mobile2.Model = 2018;
		mobile2.Price = 10500;
		
		mobile3.Comp = "Samsung";
		mobile3.Model = 2015;
		mobile3.Price = 8600;
		
		System.out.println("Mobile Comp: "+mobile1.Comp);
		System.out.println("Mobile Model: "+mobile1.Model);
		System.out.println("Mobile Price: "+mobile1.Price);
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		System.out.println("Mobile Comp: "+mobile2.Comp);
		System.out.println("Mobile Model: "+mobile2.Model);
		System.out.println("Mobile Price: "+mobile2.Price);
		
	}

}
