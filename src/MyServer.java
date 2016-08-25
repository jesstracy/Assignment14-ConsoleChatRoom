import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by jessicatracy on 8/25/16.
 */
public class MyServer {
    public void startServer() {
        try {
            ServerSocket serverListener = new ServerSocket(8080);
            System.out.println("Waiting for a connection...");

            Socket clientSocket = serverListener.accept();
            System.out.println("Connection found!");

            System.out.println("Now displaying info about who has connected to our server: ");
            System.out.println("Connection from " + clientSocket.getInetAddress().getHostAddress());

            

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
