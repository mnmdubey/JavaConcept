package oops_Concept_Part2;
/**
 * @author Manoranjan Dubey
 * Last Updated On: 21-Apr-2020
 * mail me at mnmdubey@gmail.com in case of any PR or query
 */
//===============================================================================
public class Try_OopsConcept_Test {
	
	public static void main(String[] args) {
		
		Bmw b = new Bmw();
		
		b.startCar();
		b.stopCar();
		b.service();
		
		System.out.println("++++++++++++++++++");
		b.refuelCar();
		
		System.out.println("++++++++++++++++++");
		b.allTypeOfVehicle();	
	}
}
