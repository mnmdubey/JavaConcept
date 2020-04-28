package Z_Java_Interview;

public class StringManipulation {
	
	public static void main(String[] args) {
		String str = "Lets Start"; // Begin the show with Selenium
		
		System.out.println("str:"+str);
		
		int strSize = str.length();
		System.out.println("strSize:"+strSize);
		System.out.println("-------------------------------------");
		System.out.println("charAt:"+str.charAt(0));
		System.out.println("charAt:"+str.charAt(1));
		System.out.println("charAt:"+str.charAt(2));
		System.out.println("charAt:"+str.charAt(3));
		//System.out.println("charAt:"+str.charAt(4)); //Exception in thread "main" java.lang.StringIndexOutOfBoundsException:
		System.out.println("charAt:"+str.charAt(4)); // Will give BLANK
		System.out.println("charAt:"+str.charAt(5));
		System.out.println("-------------------------------------");
		System.out.println("charAt:"+str.lastIndexOf("L"));
		System.out.println("charAt:"+str.lastIndexOf("e"));
		System.out.println("charAt:"+str.lastIndexOf("t"));
		System.out.println("charAt:"+str.lastIndexOf("s"));
		System.out.println("charAt:"+str.lastIndexOf("m")); // Will give "-1", if NOT existed
		
		System.out.println("charAt:"+str.lastIndexOf("Start"));
	}
}
