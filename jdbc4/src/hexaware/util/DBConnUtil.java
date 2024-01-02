package hexaware.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class DBConnUtil
{
	public static Connection getConn(Properties dbProp) throws ClassNotFoundException, SQLException
	{
		String user=dbProp.getProperty("user");
		String password=dbProp.getProperty("password");
		String driver=dbProp.getProperty("driver");
		String url=dbProp.getProperty("url");
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,user,password);
		return con;
	}
}
