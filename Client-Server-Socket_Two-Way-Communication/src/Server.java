import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4999);
        Socket s = serverSocket.accept();

        System.out.println("Client connected");

        //To receive from Client
        InputStreamReader input = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(input);
        String str = bf.readLine();
        System.out.println("Client: "+ str);

        //To send to client
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        //To put message in a stream
        if(!str.isEmpty()){
            pr.println("Message bien recu!");
        }
          // Output user input
        // Clear the stream
        // using flush() method
        pr.flush();

    }
}
