import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by jessicatracy on 8/25/16.
 */
public class MyClient {
    public static void main(String[] args) {
        System.out.println("MyClient running...");

        try {
            // connect to server
            Socket clientSocket = new Socket("localhost", 8080);

            // set up input and output streams
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // write message
            out.println("What up");
            String serverResponse = in.readLine();
            System.out.println("Server's response: " + serverResponse);

            // close connection
            clientSocket.close();


        } catch(IOException exception) {
            exception.printStackTrace();
        }
    }
}
