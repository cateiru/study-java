import java.io.*;
import java.net.*;

public class Client0 {
  public static void main(String args[]) {
    try {
      Socket socket = new Socket(args[0], 1234);
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      String msg = in.readLine();
      in.close();
      socket.close();

      System.out.println(msg);
    } catch (Exception err) {
      System.out.println(err);
    }
  }
}
