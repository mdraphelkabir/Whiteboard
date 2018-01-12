package whiteboard;

import Connection.Client;
import Connection.Server;
import java.net.InetAddress;

public class WhiteBoard {

    public static void main(String[] args) {
        new Thread(new Server()).start();
        try
        {
            InetAddress ip = InetAddress.getLocalHost();
            Client client = new Client(ip);
            if(true)
            {
                client.connection();
            }
        }
        catch(Exception e)
        {
            
        }
        
    }
    
}
