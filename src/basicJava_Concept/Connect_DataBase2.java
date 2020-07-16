package basicJava_Concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Connect_DataBase2 {
	
	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"	
		 //jdbc:mysql://localhost:3036/emp
		/*
		 * Server Name: DESKTOP-CM7QV2O
		 * User Name: DESKTOP-CM7QV2O\DELL
		 * Password: ""
		 */
       // String dbUrl = "jdbc:mssql://localhost:3036/CVSITE_TMJ";
		// "jdbc:myDriver:testDb", "myLoginId", "myPassword"
       // String dbUrl = "jdbc:mssql://localhost:1433/CVSITE_TMJ";
       // String dbUrl = "jdbc:DESKTOP-CM7QV2O:CVSITE_TMJ";
        String dbUrl = "jdbc:sqlserver://DESKTOP-CM7QV2O;databaseName=CVSITE_TMJ";
        //String dbUrl = "jdbc:DESKTOP-CM7QV2O:CVSITE_TMJ";
        
		//Database Username		
        String username = "mdubey";
	    
		//Database Password		
		String password = "mkdubey1";				

		//Query to Execute		
		//String query = "select * from jobSeeker;";	
        
 	    //Load mysql jdbc driver		
   	  //  Class.forName("com.mysql.jdbc.Driver");		
   	    
		try{
	   	    Connection connect = DriverManager.getConnection(dbUrl, username, password);
	   	    System.out.println("Yes DB Got Connected");
   	    	} 
		catch (SQLException e)
			{
			System.out.println("Opps, NOT Connected");
			e.printStackTrace();
			}
		
   		//Create Connection to DB		
    	//Connection con = (Connection) DriverManager.getConnection(dbUrl, username, password);
   	    //Connection conect = (Connection) DriverManager.getConnection(dbUrl, username, password);
  		//Create Statement Object	
   	    
   	    
	 
   	    //Statement stmt = (Statement) conect.createStatement();					

			// Execute the SQL Query. Store results in ResultSet		
 		//ResultSet rs= stmt.executeQuery(query);							
 
// 		// While Loop to iterate through all data and print results		
//		while (rs.next()){
//	        		String myName = rs.getString(1);								        
//                    String myAge = rs.getString(2);					                               
//                    System. out.println(myName+"  "+myAge);		
//            }		
			 // closing DB Connection	
 		
 		//System.out.println(rs);
 		//conect.close();			
}
}

