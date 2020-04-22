package basicJava_Concept;
/**
 * @author Manoranjan Dubey
 * Last Updated On: 21-Apr-2020
 * mail me at mnmdubey@gmail.com in case of any PR or query
 */
//==============================================================================
public class StringConcatenation {
	
	public static void main(String[] args) {
		
		String str1 = "Hello Agile Team";
		String str2 = "Onsite Team";
		String str3 = "200";
		String str4 = "100";
		String str5 = "and";
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(str1+str2);
		System.out.println(str1+ " - " +str2);
		System.out.println(str1+str3);
		System.out.println(str2+str4);
		System.out.println(str2+ " - " +str4);
		System.out.println(str3+str4);// This will not give 300 (200 + 100) as this is String	
		System.out.println("Num1 and Num2 is: "+num1+num2); //This will give 1020 and NOT 30
		System.out.println("Num1 and Num2 is: "+(num1+num2)); // This will give 30
		
		String strAdd = str1 + str5 + str2; // strAdd is made from str1, str2 and str3
		System.out.println(strAdd);
		
		System.out.println("==THE END, Thank you=====");
	}
}
//====TAKE AWAY FROM THIS=============================================================
/**
* String can be added by "+" sign
* String or Integer can be added from left to Right (a+b+c)
* Addition of String will give the String only
* 
* 
*/
