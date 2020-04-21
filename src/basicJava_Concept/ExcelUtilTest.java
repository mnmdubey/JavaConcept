package basicJava_Concept;
/**
 * @author Manoranjan Dubey
 * Last Updated On: 21-Apr-2020
 * mail me at mnmdubey@gmail.com in case of any PR or query
 */
//===============================================================================

public class ExcelUtilTest {
	
	public static void main(String[] args) {
		
		Xls_Reader readExeclFile = new Xls_Reader("D:\\Manoranjan\\WSBeyondLs\\Selenium_Java\\ExcelFile\\ReadExcelData.xlsx");
			
		int NoOfColumn = readExeclFile.getColumnCount("EmployeeDetails");
		System.out.println("NoOfColumn: "+NoOfColumn);
		
		int NoOfRow = readExeclFile.getRowCount("EmployeeDetails");
		System.out.println("NoOfRow: "+NoOfRow);
		
		for(int i = 2; i<= NoOfRow;i++)
		{
			String SrNo = null;
			String EmpID = null;
			
			SrNo = readExeclFile.getCellData("EmployeeDetails", 0, i);
			SrNo = SrNo.replace(".0", "");
					
			String EmplName = readExeclFile.getCellData("EmployeeDetails", 1, i);
			EmpID = readExeclFile.getCellData("EmployeeDetails", 2, i);
			EmpID = EmpID.replace(".0", "");
			String Design = readExeclFile.getCellData("EmployeeDetails", 3, i);
			
			
			System.out.println("Sr. No.: "+SrNo+ " | Emplyee Name: " +EmplName+" | Emp_ID: "+EmpID+ "| Designation: "+Design);
		}	
		
	}
}
