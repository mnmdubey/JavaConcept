package basicJava_Concept;
/**
 * @author Manoranjan Dubey
 * Last Updated On: 21-Apr-2020
 * mail me at mnmdubey@gmail.com in case of any PR or query
 */
//===============================================================================

import java.util.ArrayList;

public class ArrayListConcept {
	
	public static void main(String[] args) {
		
		ArrayList<Comparable> ar = new ArrayList<Comparable>();
		ar.add(100); //Index = 0
		ar.add(200); //Index = 1
		ar.add(300); //Index = 2
		
		System.out.println(ar.size());
		ar.add("Hello"); //Index = 3
		ar.add("Naveen"); //Index = 4
		ar.add("How are you?"); //Index = 5
		
		int arCount = ar.size();
		System.out.println(arCount);
		for(int i = 0; i<= arCount-1; i++)
		{
			System.out.println("Array List (No Resistriction) Value for Index - " +i+ ": " +ar.get(i));
		}

		System.out.println("++++++++++++++++++++++++++++++++++++++");
		
		ArrayList<Integer> ari = new ArrayList<Integer>();
		ari.add(1001);
		ari.add(2001);
		
		int ariCount = ari.size();
		System.out.println(ariCount);
		for (int i = 0; i<=ariCount-1; i++)
		{
			System.out.println("Array List (Restricted for Integer) Value for Index - " +i+ ": " +ari.get(i));
		}
		
		//
//		ari.add(100.26); // Can not be added as ArrayList ari is restricted for Integer
//		ari.add("Man"); // Can not be added as ArrayList ari is restricted for Integer
//		ari.add('c'); // Can not be added as ArrayList ari is restricted for Integer
//		ari.add(1002.3665); // Can not be added as ArrayList ari is restricted for Integer
		
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		ArrayList<String> ars = new ArrayList<String>();
		ars.add("Thank");
		ars.add("You Naveen");
		ars.add("You make the Java Simple");
		
		int arsCount = ars.size();
		System.out.println(arsCount);
		
		for(int s = 0; s<= arsCount-1; s++)
		{
			System.out.println("Array List (Restricted for String) Value for Index - " +s+ ": " +ar.get(s));	
		}
		
		System.out.println("==THE END, Thank you=====");
	}
	

}
