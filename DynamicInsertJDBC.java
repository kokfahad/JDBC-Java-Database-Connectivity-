// Dynamically inserting data in table

import java.sql.*;

class DynamicInsertJDBC
{
	public static void main(String[] args){
			try{
			//load the driver

			Class.forName("com.mysql.cj.jdbc.Driver");

			//creating a connection

			String url = "jdbc:mysql://localhost:3306/firstJdbc";
			String username = "root";
			String password = "root";
			
			Connection con = DriverManager.getConnection(url, username, password);

			//create a query

			String q = "insert into table1(tName, tCity) values(?,?)";

            PreparedStatement stmt = con.prepareStatement(q);

            stmt.setString(1, "Fahad Khan");
            stmt.setString(2, "Dhaka");
           
            stmt.executeUpdate();
           
            System.out.println("Data Inserted Successfully !!");

            con.close();

		}catch(Exception e){
           e.printStackTrace();
		}

	}
}