import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("localhost", 4999);
        PrintWriter pr = new PrintWriter(clientSocket.getOutputStream());


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Entrez un message: ");

        String msg = myObj.nextLine();  // Read user input
        //To put message in a stream
        pr.println(msg);  // Output user input

        // Clear the stream
        // using flush() method
        pr.flush();

        //To receive from Server
        InputStreamReader input = new InputStreamReader(clientSocket.getInputStream());
        BufferedReader bf = new BufferedReader(input);
        String str = bf.readLine();
        System.out.println("Server: "+ str);

    }
}
