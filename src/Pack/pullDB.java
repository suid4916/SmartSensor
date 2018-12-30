package Pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pullDB {
	public void pull(String arg1) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con;
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		String user = "root";
		String pass = "ckdtjq17";
		double sum = 0, avg = 0, max = 0, min = 0;
		int count = 0;
		ResultSet result;
		con = DriverManager.getConnection(url, user, pass);
		Statement s = con.createStatement();
		String selectAVG = "select avg(value) from id" + arg1 + ";";
		result = s.executeQuery(selectAVG);
		while (result.next()) {
			System.out.println("avg = "+result.getDouble(1));
			avg = result.getDouble(1);
		}
		result = null;
		result = s.executeQuery("select value from id" + arg1 + ";");
		while (result.next()) {
			sum += result.getDouble("value");
		//	sum += (result.getDouble("value") - avg);
			// System.out.println(result.getDouble("value")-avg);
			// sum += result.getDouble("value")-avg;
		}
		System.out.println("sum = "+sum);
		sum = sum / 130;
		System.out.println("sum / 130 = " + sum);
	//	System.out.println("Variation = "+sum);
	/*	result = null;
		result = s.executeQuery("select count(value) from id" + arg1 + ";");
		while (result.next())
			count = result.getInt(1);
		sum = Math.sqrt(sum / count);
		System.out.println("Standard Variation = "+sum);
		min = avg - sum;
		max = avg + sum;
		System.out.println("min = "+min);
		System.out.println("max = "+max);*/
	}
}
