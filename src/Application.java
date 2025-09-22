package src;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Application{
    private static ServerSocket server;
    private static int port = 10525;
    public static void main (String[] args) {
        try{
            server = new ServerSocket(port);

            while(true){
                Socket socket = server.accept();
                InputStream request = socket.getInputStream();
                System.out.println(request);
                socket.close();
                break;
            }

            server.close();
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());

        }
    }
}