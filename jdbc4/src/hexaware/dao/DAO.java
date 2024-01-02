package hexaware.dao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import hexaware.util.DBConnUtil;
import hexaware.util.DBPropertyUtil;
public class DAO 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException 
	{
		Properties dbProps=DBPropertyUtil.getConnString("db.properties");
		Connection con=DBConnUtil.getConn(dbProps);
	}

}
