package basicJava_Concept;
/**
 * @author Manoranjan Dubey
 * Last Updated On: 21-Apr-2020
 * mail me at mnmdubey@gmail.com in case of any PR or query
 */
//===============================================================================
public class IfElseCondition {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int p = 20;
		int q = 30;
		
		if(a==b)
		{
			System.out.println("This is Matched");
		}
		
		else
			
		{
			System.out.println("This DID NOT Matched");
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		if(p!=q)
		{
			System.out.println("Condition is TRUE: Here p is NOT Equal to q");
		}
		
		else	
		{
			System.out.println("Condition is FALSE: Here p is Equal to q");
		}
	}
}
