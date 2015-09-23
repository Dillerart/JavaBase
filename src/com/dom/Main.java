package com.dom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dom.driver.BaseD;
import com.dom.driver.Reader;

public class Main {

	private static List<BaseD> list;
	
	private static Reader read;
	
	private static String nameDriver = "com.mysql.jdbc.Driver";
	
	private static String command = "Select * from Client";
	
	public static void main(String[] args) {	
		read = new Reader();
		list = new ArrayList<BaseD>();
		try {
			Class.forName(nameDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection(read.getUrl(), read.getUser(), read.getPass());
			//Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/Wolf", "root", "2936933");
			Statement commandSQL = connect.createStatement();
			ResultSet result = commandSQL.executeQuery(command);
			while(result.next()){
				list.add(new BaseD(result.getInt(1),result.getString(2),result.getString(3),result.getString(4)));
			}
			connect.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(list != null){
			for(BaseD lis: list){
				System.out.println("id - " + lis.getId() + "  FirstName - "+ lis.getFirstName() + "  LastName - " + lis.getLastName() +  "Phone - " + lis.getPhone());
			}
		}
		
	}

}
