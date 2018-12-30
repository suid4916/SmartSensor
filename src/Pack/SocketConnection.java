package Pack;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

public class SocketConnection {
	public String SocketConn() throws IOException, ClassNotFoundException, SQLException{
		int count =0;
		String ip="";
		ServerSocket sock;
		sock = new ServerSocket(3300);
		SQLCreation sql = new SQLCreation();
		while(count<300){
			Socket socket = sock.accept();
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			ip = socket.getInetAddress().toString().replace("/", "").replace(".","");
			String value = dis.readLine().trim();
			String result = sql.SQLCre(ip, value);
			System.out.println(count +" "+ result);
			count++;
		}
		return ip;
	}
}
