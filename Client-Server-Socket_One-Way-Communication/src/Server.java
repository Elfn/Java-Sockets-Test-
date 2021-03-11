import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4999);
        Socket s = serverSocket.accept();

        System.out.println("Client connected");

        InputStreamReader input = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(input);

        String str = bf.readLine();
        System.out.println("Client: "+ str);


    }
}
