package basicJava_Concept;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class Connect_DataBase {
	
	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													

		/* Server Name: DESKTOP-CM7QV2O
		 * databaseName: CVSITE_TMJ
		 * User Name: mdubey
		 * Password: mkdubey1
		 */
      //  String dbUrl = "jdbc:sqlserver://DESKTOP-CM7QV2O: databaseName = CVSITE_TMJ"; 
		
        //String dbUrl =  "jdbc:sqlserver://DESKTOP-CM7QV2O\\CVSITE_TMJ";
        String dbUrl =  "jdbc:sqlserver://localhost/beyondsolution";
        //Database Username		
        String username = "root";
	    
		//Database Password		
		String password = "";					
   	    
		try{
			// Class.forName("com.sqlserver.jdbc.Driver");
	   	    Connection connect = DriverManager.getConnection(dbUrl, username, password);
	  	    System.out.println("Yes, DB Got Connected");
   	    	} 
		catch (SQLException e)
			{
			System.out.println("Opps, NOT Connected");
			e.printStackTrace();
			}		
		}
}

