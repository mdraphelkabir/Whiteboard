package Connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author Lucaa
 */
public class Client {
    private Socket socket;
    private InetAddress ip;
    final private int port = 8888;
    
    public Client(InetAddress ip)
    {
        this.ip = ip;
    }
    
    public void connection() throws IOException
    {
        socket = new Socket(ip, port);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter printer = new PrintWriter(socket.getOutputStream());
        
        String s = "Prova messaggio";
        printer.println(s);
        printer.flush();
        
    }
}
