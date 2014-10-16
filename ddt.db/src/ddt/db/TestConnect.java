package ddt.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.udiga.ddt.model.Dept;
import org.udiga.ddt.model.Person;

public class TestConnect {

	public static void main(String[] args) {
		
		ArrayList lst;
		TestConnect tc = new TestConnect();
		
		lst = tc.getPersons();
		for (Object object : lst) {
			System.out.println(object);
		}
		lst = tc.getDepts();
		for (Object object : lst) {
			System.out.println(object);
		}
		
	}


	
	
	public ArrayList<Person> getPersons() {
		
		ArrayList<Person> persons = new ArrayList<>();
		
		String query = "SELECT * FROM PERSON";
		Connection con = null;
		
		try {

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:DDT");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int id = rs.getInt("id");
				String lname = rs.getString("L_NAME");
				String fname = rs.getString("F_NAME");
				String mname = rs.getString("M_NAME");
//				float cost = rs.getFloat("Cost");
				Person person = new Person(id,fname, mname, lname); 
				persons.add(person);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		return persons;
	}

	public ArrayList<Dept> getDepts() {
		
		ArrayList<Dept> depts = new ArrayList<>();
		
		String query = "SELECT * FROM DEPT";
		Connection con = null;
		
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:DDT");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("NAME");
//				float cost = rs.getFloat("Cost");
				Dept dept = new Dept(id,name); 
				depts.add(dept);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	
		return depts;
	}
}
