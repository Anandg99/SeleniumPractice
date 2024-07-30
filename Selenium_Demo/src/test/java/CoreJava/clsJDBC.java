package CoreJava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;
public class clsJDBC 
{

@Test
public void GetEmployees() throws SQLException
{
	String connectionUrl =
            "jdbc:sqlserver://localhost:1434;"
                    + "database=Employee;"
                    + "user=CORP\\Anand.Gummadilli;"
                    + "password=Anvesh20482048@;";
	//String connectionUrl1 = "jdbc:sqlserver://localhost:1434;databasename=Employee";
	//String s = "jdbc:sqlserver://localhost:1433;DatabaseName=DummyDatabase;user=sa;password=YourSAaccountpassword "
	 ResultSet resultSet = null;
	 //DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
     try (Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1434","CORP\\Anand.Gummadilli","Anvesh20482048@");
             Statement statement = connection.createStatement();) {

         // Create and execute a SELECT SQL statement.
         String selectSql = "SELECT * from employee";
         resultSet = statement.executeQuery(selectSql);

         // Print results from select statement
         while (resultSet.next()) 
         {
             System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
         }
 }
}
}
