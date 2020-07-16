package basicJava_Concept;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class Connect_phpMyAdmin {

//}
//
//
//class main
//{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = null;
conn = DriverManager.getConnection("jdbc:mysql://localhost/beyondsolution","root", "");
System.out.print("Database is connected !");
conn.close();
}
catch(Exception e)
{
System.out.print("Do not connect to DB - Error:"+e);
}
}
}
