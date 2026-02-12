import java.net.ServerSocket;
import java.net.Socket;

class Server {
    public static void main(String[] args) throws Exception {

        System.out.println("Server started...");

        ServerSocket serverSocket = new ServerSocket(5000);

        Socket socket = serverSocket.accept();

        System.out.println("Client connected!");

        serverSocket.close();
    }
}
