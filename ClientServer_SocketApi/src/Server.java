import java.io.*;
import java.net.*;

public class Server {
    public static final int Port = 1234;

    public static void main(String[] args) throws Exception {
        // Use try-with-resources for ServerSocket
        try (ServerSocket ss = new ServerSocket(Port)) {
            System.out.println("Server bound to Port " + Port);

            while (true) {
                System.out.println("Server listening...");

                // Use try-with-resources for Socket
                try (Socket socket = ss.accept()) {
                    // Use DataOutputStream for output
                    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                    out.write("Hello World!".getBytes());
                }
            }
        }
    }
}

