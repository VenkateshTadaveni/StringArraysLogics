package jdbc;
import java.util.*;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ConnectionDemo {

	public static void main(String[] args) {
		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter rollno: ");
//			int rollno = sc.nextInt();
//			System.out.println("enter name: ");
//			String name  = sc.next();
//			System.out.println("enter marks: ");
//			int marks = sc.nextInt();
			Class.forName("oracle.jdbc.driver.OracleDriver");//loading the driver of oracle database
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "venkatesh", "welcome");//this is getting access to oracle using jdbc
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from student1");
//			ResultSetMetaData rm = rs.getMetaData();
//			int x = rm.getColumnCount();
//			for(int i=1;i<=x;i++) {
//				System.out.print(rm.getColumnName(i)+"\t");
//			}
//			System.out.println();
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.println(rs.getInt(3));

			}
			System.out.println("record inserted successfully");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}

}
