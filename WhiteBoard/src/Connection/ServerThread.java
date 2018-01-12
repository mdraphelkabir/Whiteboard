package Connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            
            
            s = buffer.readLine();
            System.out.println(s);
        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
