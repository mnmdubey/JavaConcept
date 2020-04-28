package otherJava_Concept;

public class FinallyConcept {
	
	//Finally Block will be Executed all the time
	public static void main(String[] args) {
		
		System.out.println("Finally Concept");
		System.out.println("-------------------------------------");
		
		testFinally();
		testFinally_2();
		
	}
	
	public static void testFinally(){
		try{
			System.out.println("testFinally -- Inside Try Block");
			throw new RuntimeException("test");
			}
		catch(Exception e)
			{
			System.out.println("testFinally -- Inside CATCH Block");
			}
		
		finally
			{
			System.out.println("testFinally -- Inside FINALLY Block");
			System.out.println("-------------------------------------");
			}
	}
	
	public static void testFinally_2(){
		try{
			System.out.println("testFinally_2 - Inside Try Block"); 
			int i = 10;
			int k = i/0;
			throw new RuntimeException("testFinally_2 - test");
			}
		catch(Exception e)
			{
			System.out.println("testFinally_2 - Inside CATCH Block");
			}
		
		finally
			{
			System.out.println("testFinally_2 -- Inside FINALLY Block");
			System.out.println("-------------------------------------");
			}
	}
}

