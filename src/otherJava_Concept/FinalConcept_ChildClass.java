package otherJava_Concept;

public class FinalConcept_ChildClass extends FinalConcept_ParentClass {
	
	
	
	public static void main(String[] args) {
		System.out.println("FinalConcept_ChildClass - Main");
		
		FinalConcept_ParentClass fcpc = new FinalConcept_ParentClass();
		
		start_0();  // Called by method name as this method was Static
		
		fcpc.start_1(); // Called by object Reference as this method was NOT Static
		
		//start_2(); // can NOT as this method is used final keyword		
		}

}
