package otherJava_Concept;

//public final class FinalConcept_ParentClass { //This class can NOT be access by parent Class as this is final (Constant)
//To Prevent inheritence
//To prevent method Overriding
	
public class FinalConcept_ParentClass {
	
	public static void start_0(){
		System.out.println("FinalConcept_ParentClass -- parentClassMethod_0 - This is Non Static");
	}
	
	public void start_1(){
		System.out.println("FinalConcept_ParentClass -- parentClassMethod_1");
	}
	
	public final void start_2(){
		System.out.println("FinalConcept_ParentClass -- parentClassMethod_2 >> final keyword used and can NOT be access");
		
	}

}
