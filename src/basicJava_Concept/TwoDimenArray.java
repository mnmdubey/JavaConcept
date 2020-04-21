package basicJava_Concept;
/**
 * @author Manoranjan Dubey
 * Last Updated On: 21-Apr-2020
 * mail me at mnmdubey@gmail.com in case of any PR or query
 */
//===============================================================================
public class TwoDimenArray {

	public static void main(String[] args) {
		
		String StrArr [][] = new String[3][5];
		
		System.out.println(StrArr.length);		// Total Number of Rows
		System.out.println(StrArr[0].length);   // Total Number of Column
		System.out.println(StrArr[1].length);   // Total Number of Column
		System.out.println(StrArr[2].length);   // Total Number of Column
		
		//Row and Column
		StrArr[0][0] = "A";
		StrArr[0][1] = "B";
		StrArr[0][2] = "C";
		StrArr[0][3] = "D";
		StrArr[0][4] = "E";
		
		StrArr[1][0] = "A1";
		StrArr[1][1] = "B1";
		StrArr[1][2] = "C1";
		StrArr[1][3] = "D1";
		StrArr[1][4] = "E1";	
		
		StrArr[2][0] = "A2";
		StrArr[2][1] = "B2";
		StrArr[2][2] = "C2";
		StrArr[2][3] = "D2";
		StrArr[2][4] = "E2";
		
		System.out.println("Value of Two Dimention Array is: "+StrArr[0][0]);
		for (int i = 0; i<=StrArr.length-1; i++ )
		{
			for (int j = 0; j<=StrArr[0].length-1; j++)
			{
				System.out.println("Value of Two Dimention Array is: "+StrArr[i][j]);
			}
		}

		
		

	}

}
