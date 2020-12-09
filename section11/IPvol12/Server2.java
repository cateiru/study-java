import java.io.*;
import java.net.*;

public class Server2 {
  public static final int PORT = 4567;

  public static void main(String[] args) {
    ServerSocket serverSocket = null;
    Socket socket = null;
    try {
      serverSocket = new ServerSocket(PORT);
      System.out.println("Server2が起動しました(port=" + serverSocket.getLocalPort() + ")");
      socket = serverSocket.accept();
      System.out.println("接続されました " + socket.getRemoteSocketAddress());

      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

      String line;

      while ((line = in.readLine()) != null) {
        System.out.println("Client's message: " + line);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
