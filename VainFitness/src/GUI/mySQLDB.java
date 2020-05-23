package GUI;

import java.sql.DriverManager;

public class mySQLDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DBConnect connect = DBConnect.getInstance("vainfitness","root","");
		
		connect.getData();
		
		boolean result = connect.insertClientData("Client", "Koolaidrian", "myPAssW", "oshea", "campbell", "1876555444", "email@example.com", 1, 178.0, "Male", "1998-10-08", "somewhere", 1550.0, 40, 50, 10, 125.0, 130.0, 150.0);
		
		if(!(result)) {
			System.out.println("Success!\n");
			connect.getData();
		}else {
			System.out.println("Failed!\n");
		}
	}

}

