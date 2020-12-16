import java.io.*;
import java.net.Socket;

public class client {
  public static final int PORT = 4567;

  public static void main(String[] args) {
    Socket socket = null;

    try {
      socket = new Socket(args[0], PORT);
      System.out.println("接続しました " + socket.getRemoteSocketAddress());

      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

      BufferedReader keyIn = new BufferedReader(new InputStreamReader(System.in));

      // input two integer.
      String input;
      for (int i = 0; 2 > i; ++i) {
        input = keyIn.readLine();
        out.println(input);
      }

      // output to console.
      String line;
      while ((line = in.readLine()) != null) {
        System.out.println("ans = " + line);
      }

      out.close();
      in.close();
      socket.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
