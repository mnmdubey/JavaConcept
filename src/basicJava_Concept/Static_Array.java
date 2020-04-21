package basicJava_Concept;
/**
 * @author Manoranjan Dubey
 * Last Updated On: 21-Apr-2020
 * mail me at mnmdubey@gmail.com in case of any PR or query
 */
//===============================================================================

public class Static_Array {

	public static void main(String[] args) {
		
		
		// Array concept - To Store similar data type
		
		//1. Interger Array
		int intArr [] = new int [4];

		System.out.println(intArr.length);
		
		intArr [0] = 10;
		intArr [1] = 20;
		intArr [2] = 30;
		intArr [3] = 40;
		
		System.out.println(intArr[2]);
		
		for(int i = 0; i<=intArr.length-1; i++)
		{
			System.out.println(intArr[i]);
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		
		//2. Double Array
		Double DoubleArr [] = new Double [5];

		System.out.println(DoubleArr.length);
		
		DoubleArr [0] = 10.02;
		DoubleArr [1] = 13.321;
		DoubleArr [2] = 106.99;
		DoubleArr [3] = 1234.56;
		DoubleArr [4] = 12345.99;
		
		System.out.println(DoubleArr[3]);
		
		for(int k = 0; k<=DoubleArr.length-1; k++)
		{
			System.out.println(DoubleArr[k]);
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		//3. String Array
		String StrArr [] = new String [3];

		System.out.println(StrArr.length);
		
		StrArr [0] = "Gmail";
		StrArr [1] = "Outlook";
		StrArr [2] = "Yahoo";
		
		System.out.println(StrArr[1]);
		
		for(int j = 0; j<=StrArr.length-1; j++)
		{
			System.out.println(StrArr[j]);
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		//4. Charater Array
		char StrChar [] = new char [3];

		System.out.println(StrChar.length);
		
		StrChar [0] = 'p';
		StrChar [1] = 'q';
		StrChar [2] = 'r';
		
		System.out.println(StrChar[1]);
		
		for(int j = 0; j<=StrChar.length-1; j++)
		{
			System.out.println(StrChar[j]);
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		
		//5. Object Array
		Object StrObj [] = new Object [4];

		System.out.println(StrObj.length);
		
		StrObj [0] = "EmpName";
		StrObj [1] = 198;
		StrObj [2] = 'M';
		StrObj [3] =  "Location: Mumbai";
		
		System.out.println(StrObj[1]);
		System.out.println(StrObj[3]);
		
		for(int j = 0; j<=StrObj.length-1; j++)
		{
			System.out.println(StrObj[j]);
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println("==THE END, Thank you=====");
	}

}
