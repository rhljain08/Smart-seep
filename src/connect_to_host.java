import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;


public class connect_to_host
{
	private String host;
	Socket con;
	connect_to_host(String a) throws IOException
	{
	    host=a;	
	    System.out.println(a);
	    con=new Socket(InetAddress.getByName(host),8000);
	    System.out.println(con);
	}
    
}
