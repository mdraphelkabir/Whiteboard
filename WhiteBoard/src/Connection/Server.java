package Connection;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Lucaa
 */
public class Server implements Runnable{
    private ServerSocket serverSocket;
    
    @Override
    public void run() {
        try
        {
            serverSocket = new ServerSocket(8888);
            while(true)
            {
                Socket socket = serverSocket.accept();
                new Thread(new ServerThread(socket)).start();
                
            }
        }
        catch(IOException e)
        {
            
        }
    }
    
}
