package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Model.ConnectionFactory;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");
		connection.close();
	}

}
