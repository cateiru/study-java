import java.io.*;
import java.net.*;

public class server {
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
      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

      // get two integer from client and sum it.
      int ans = 0;
      for (int i = 0; 2 > i; ++i) {
        String line = in.readLine();
        ans += Integer.parseInt(line);
      }

      // export sum.
      out.println(ans);

      out.close();
      in.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
