package basicJava_Concept;
/**
 * @author Manoranjan Dubey
 * Last Updated On: 21-Apr-2020
 * mail me at mnmdubey@gmail.com in case of any PR or query
 */
//==============================================================================
public class LoopConcept {
	public static void main(String[] args) {
		int w = 0;
		while(w <= 5)
		{
		System.out.println("While loop output is: "+w);
		w = w+1;// Increamental or Decreamental
		}
		
		System.out.println("+++++++++++++++++++++++");
		int reqNumTable = 9;
		int loopCnt = 10;
		
		System.out.println("+++++++++++++++++++++++");
		for(int i = 1; i<=loopCnt; i++ ){
			int Sum = reqNumTable*i;
			System.out.println("Table of "+reqNumTable+ " is: "+Sum);
		}
		
		System.out.println("+++++++++++++++++++++++");
		for(int i = 1; i<=10; i++ ){
			System.out.println("For loop output is: "+i);
		}
		
		System.out.println("==THE END, Thank you=====");
	}
}
//====TAKE AWAY FROM THIS=============================================================
/**
* For Loop is used for Iteration purpose
* while loop have DisAdvantage - Can go to infinite loop, if Increament/ Decreament not defined
* 
* 
* 
*/

