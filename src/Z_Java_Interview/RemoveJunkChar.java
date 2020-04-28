package Z_Java_Interview;

public class RemoveJunkChar {

	public static void main(String[] args) {
		
		String str = "  Hello, Lets Start with Selenium  ";
		System.out.println("str:"+str);
		System.out.println("str:"+str.trim());
		
		System.out.println("-------------------------");  
		String str1 = "This#string%contains^special*characters&.";   
		String str2 = str1.replaceAll("[^a-z, A-Z, 0-9]", " ");  
		String str3 = str1.replaceAll("[^a-z, A-Z, 0-9]", "<<>>"); 
		System.out.println(str1);  
		System.out.println(str2);  
		System.out.println(str3);  
		System.out.println("-------------------------"); 
		String Price = "$341.00";
		String NetPrice = Price.replace("$", "").replace(",", "").replace(".00", "");
		System.out.println("NetPrice:"+NetPrice);
		
		int NetPrice_int = Integer.parseInt(NetPrice);
		System.out.println("NetPrice_int:"+NetPrice_int);
		System.out.println("Double NetPrice_int:"+(NetPrice_int*2));
		System.out.println("Half NetPrice_int:"+((NetPrice_int/2)*100.00/100.00));
		System.out.println("-------------------------"); 
		double NetPrice_Double = Double.parseDouble(NetPrice);
		System.out.println("NetPrice_int:"+NetPrice_Double);
		System.out.println("Double NetPrice_Double:"+(NetPrice_Double*2));
		System.out.println("Half NetPrice_Double:"+((NetPrice_Double/2)*100.00/100.00));
	}
}
