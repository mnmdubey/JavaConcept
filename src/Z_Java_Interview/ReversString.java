package Z_Java_Interview;

/**
 * How to Reverse the String
 *
 */
public class ReversString {

	public static void main(String[] args) {
		
		String str1 = "Lets Start with Selenium";
		System.out.println(str1);
		
		int scc = str1.length()-1;
		String rs = "";
		for (int i = scc; i>=0; i--)
		{
			rs = rs + str1.charAt(i);
			//System.out.println(rs);
		}
		System.out.println(rs);
		System.out.println("------------------------");
		//String rs2 = "";
		StringBuffer sf = new StringBuffer(str1);
		System.out.println(sf.reverse());
	}
}
