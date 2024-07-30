import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTest {
	public static void main(String[] args) {
		String connectionUrl1 =
	            "jdbc:sqlserver://localhost:1433;"
	                    + "database=Employee;"
	                    + "user=anand.gummadilli@neudesic.com;"
	                    + "password=Anvesh20482048@;"
	                    + "encrypt=true;"
	                    + "trustServerCertificate=false;"
	                    + "loginTimeout=30;";
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databasename=Employee;integratedSecurity=true";
		 ResultSet resultSet = null;

	     try (Connection connection = DriverManager.getConnection(connectionUrl);
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
