package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
		static final String deiver = "oracle.jdbc.driver.OracleDriver";
		static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		public static Connection getConnection() throws Exception {
			
			
			Class.forName(deiver);
			Connection con = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("DB 연결 성공");
			return con;
		}
}