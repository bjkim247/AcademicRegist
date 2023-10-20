import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		Properties properties = new Properties();
		try {
			//1. db.properties 로드
			try {
				FileInputStream fis = new FileInputStream("src/config/db/properties");
				properties.load(fis);
				String avalue = properties.getProperty("driver");
				System.out.println();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		} finally {}
		
	}

}
