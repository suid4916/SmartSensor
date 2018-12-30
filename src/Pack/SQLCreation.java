package Pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLCreation {
	public String SQLCre(String arg1, String arg2) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con;
		String url = "jdbc:mysql://127.0.0.1:3306/test",user = "root",pass = "ckdtjq17";
		String result = "";
		con = DriverManager.getConnection(url, user, pass);
		Statement s = con.createStatement();
		String createTable = "create table if not exists id"+arg1+" (value DECIMAL(5,2))";
		s.execute(createTable);
		String insert = "insert into id"+arg1+" values ("+arg2.toString()+")";
		s.execute(insert);
		System.out.println(insert);
		return "Insert Success!";
	}
}
