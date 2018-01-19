package Connection;

import java.io.BufferedReader;
import java.io.*;
import java.net.*;

/**
 *
 * @author Luca
 */
public class ServerThread implements Runnable{
    
    private Socket socket;
    String s;
    
    public ServerThread(Socket socket)
    {
        this.socket = socket;
    }
    
    @Override
    public void run() {
        try(
            BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printer = new PrintWriter(socket.getOutputStream());
                ) {
            
            while(true)
            {
                s = buffer.readLine();
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
