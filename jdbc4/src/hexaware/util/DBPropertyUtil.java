package hexaware.util;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class DBPropertyUtil 
{
	static public Properties getConnString(String fileName) throws IOException
	{
		//establishing a connection to the file
		FileInputStream fis= new FileInputStream(fileName);
		Properties p=new Properties();
		/*user=root
			password=madhu
			driver=com.mysql.cj.jdbc.Driver
			url=jdbc:mysql://localhost:3306/ecommerce
		*/
		//load method loads the properties existed in a file into Properties object called p
		p.load(fis);
		return p;
	}
}
