package basicJava_Concept;
/**
 * @author Manoranjan Dubey
 * Last Updated On: 21-Apr-2020
 * mail me at mnmdubey@gmail.com in case of any PR or query
 */
//===============================================================================

import java.util.Hashtable;

public class HashTableConcept {
	
	public static void main(String[] args) {
		
		
		Hashtable ht = new Hashtable();
		
		ht.put(1, "1001");
		ht.put("2", "2001");
		ht.put(3, "3003");
		ht.put("R_01", "Amrita");
		ht.put("R_05", "Deepti");
		
		System.out.println(ht.get(1)); // Will give 1001
		System.out.println(ht.get(2)); // Will give null
		System.out.println(ht.get("2")); // Will give 2001
		System.out.println(ht.get(3)); // will give 3003
		System.out.println(ht.get("R_05"));
		
		System.out.println("Size of HashTable: "+ht.size());
		ht.put("A", "90");
		ht.put("B", "80");
		ht.put("C", "70");
		
		System.out.println("Size of HashTable: "+ht.size());
		System.out.println(ht.get("A"));
		
		System.out.println("+++++++++++++++++++++++");
		
		Hashtable<Integer, Integer> htii = new Hashtable<Integer, Integer>();
		htii.put(123, 1230012);
		System.out.println("Size of HashTable: "+htii.size());
		System.out.println(htii.get(123));
		// hti.put("12", "123"); //This will give the error as hti is Restricted to Integer and Integer and this is being pass as String
		
		System.out.println("+++++++++++++++++++++++");
		
		Hashtable<Integer, String> htiS = new Hashtable<Integer, String>();
		htiS.put(31, "ECE"); // Engineering Branch Code and their Name
		htiS.put(32, "E&I"); // Engineering Branch Code and their Name
		htiS.put(33, "CSE"); // Engineering Branch Code and their Name
		htiS.put(44, "MECH"); // Engineering Branch Code and their Name
		
		System.out.println("Size of HashTable: "+htiS.size());
		System.out.println(htiS.get(31));
		System.out.println(htiS.get(44));
		// hti.put("12", "123"); //This will give the error as hti is Restricted to Integer and Integer and this is being pass as String
		
		System.out.println("+++++++++++++++++++++++");
		
		Hashtable<String, Integer> htSi = new Hashtable<String, Integer>();
		htSi.put("Dinesh", 102); // EmployeeName and their ID
		htSi.put("DP", 183); // EmployeeName and their ID
		// htS.put(123, 1230012); //This will give the error as htS is Restricted to String and String and this is being pass as Integer
		System.out.println("Size of HashTable: "+htSi.size());
		System.out.println(htSi.get("Dinesh"));
		System.out.println(htSi.get("DP"));
		// hti.put("12", "123"); //This will give the error as hti is Restricted to Integer and Integer and this is being pass as String
		
		System.out.println("+++++++++++++++++++++++");
		
		Hashtable<String, String> htSS = new Hashtable<String, String>();
		htSS.put("fName", "Manoranjan"); //FirstName and LastName
		htSS.put("lName", "Dubey"); //FirstName and LastName
		// htS.put(123, 1230012); //This will give the error as htS is Restricted to String and String and this is being pass as Integer
		System.out.println("Size of HashTable: "+htSS.size());
		System.out.println(htSS.get("fName"));
		System.out.println(htSS.get("lName"));
		
		// hti.put("12", "123"); //This will give the error as hti is Restricted to Integer and Integer and this is being pass as String
		
		
		}

}
