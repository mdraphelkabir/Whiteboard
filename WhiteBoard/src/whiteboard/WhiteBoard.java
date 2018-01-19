package whiteboard;

import Connection.Client;
import Connection.Server;
import java.net.InetAddress;

public class WhiteBoard {

    public static void main(String[] args) {
        new Thread(new Server()).start();
        try
        {
            InetAddress ip = InetAddress.getByName("192.168.1.136");
            Client client = new Client(ip);
            if(true)
            {
                client.connection();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
}
