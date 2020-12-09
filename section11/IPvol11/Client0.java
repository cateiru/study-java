import java.io.*;
import java.net.*;

public class Client0 {
  public static void main(String args[]) {
    try {
      Socket socket = null;
      if (args.length >= 2) {
        socket = new Socket(args[0], Integer.parseInt(args[1]));
      } else if (args.length == 1) {
        socket = new Socket(args[0], 1234);
      } else {
        System.out.println("Please select host and port.");
        System.exit(1);
      }

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
