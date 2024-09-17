import java.net.*;
import java.io.*;

public class Client {
    public static final int Port = 1234;
    public static final String Host = "localhost";

    public static void main(String[] args) throws Exception{
        //Connection Opening
        try(Socket socket = new Socket(Host,Port )) {
            //I/O the client outputs "Hello World!"

                DataInputStream in = new  DataInputStream (socket.getInputStream());
                //read message sent by Server
                String message = new String(in.readAllBytes());
                System.out.println(message);

        }
    }
}
