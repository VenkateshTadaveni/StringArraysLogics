package com.jdbcEx;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class TestConnection {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "venkatesh",
					"welcome");
			Statement statement = connection.createStatement();
			// Creating Table in Database(Oracle)Once it is Created then Comment it
			// OtherWise it gets Error i.e EveryTime New Table is Created
			// statement.executeUpdate("create table Fruits(friutName varchar2(10),friutCost
			// number(5),friutColor varchar2(10))");

			// Inserting a row
			statement.execute("insert into Fruits values('Grapes',200,'Black')");
			// System.out.println("One row inserted");
			// Updating the row in table
			// statement.executeUpdate("update Fruits set friutName = 'Mango' where
			// friutCost = 200");
			System.out.println("One row Updated");
			// Delete a row in table
			statement.executeUpdate("delete Fruits where friutName = 'Mango'");
			System.out.println("One row Deleted");

			ResultSet resultSet = statement.executeQuery("select * from Fruits");
			ResultSetMetaData data = resultSet.getMetaData();
			int no = data.getColumnCount();
			for (int i = 1; i <= no; i++) {
				System.out.print(data.getColumnName(i) + "\t");

			}
			System.out.println();
			while (resultSet.next()) {
				System.out.print(resultSet.getString(1) + "\t" + "\t");
				System.out.print(resultSet.getInt(2) + "\t" + "\t");
				System.out.println(resultSet.getString(3) + "\t");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
