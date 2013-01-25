
import java.io.*;
import java.net.*;
import java.util.Vector;

public class host {
	
	public host(int num_listen)
	{
		int port =8000;
		Vector<Socket> vector = new Vector<Socket>();
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(port);
			System.out.println(ss);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<num_listen;i++){
			Socket connection=null;
			try {
				connection = ss.accept();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(connection.getRemoteSocketAddress().toString());
			vector.add(connection);				
		}
		
	}
}
