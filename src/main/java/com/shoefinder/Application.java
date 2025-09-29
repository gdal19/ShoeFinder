package src.main.java.com.shoefinder;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import com.sun.net.httpserver.HttpServer;

public class Application{
    private static ServerSocket server;
    private static int port = 10525;

    public static void main (String[] args) throws IOException{
        try{
            HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
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