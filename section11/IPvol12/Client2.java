import java.io.*;
import java.net.Socket;

public class Client2 {
  public static final int PORT = 4567;

  public static void main(String[] args) {
    Socket socket = null;

    try {
      socket = new Socket(args[0], PORT);
      System.out.println("接続しました " + socket.getRemoteSocketAddress());
      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
      BufferedReader keyIn = new BufferedReader(new InputStreamReader(System.in));
      String input;

      while ((input = keyIn.readLine()).length() > 0) {
        out.println(input);
      }
      out.close();
      socket.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
