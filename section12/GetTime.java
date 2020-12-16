import java.io.*;
import java.net.*;

public class GetTime {
  public static void main(String args[]) {
    try {
      Socket socket = new Socket("132.163.97.2", 13);

      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

      String c;
      while ((c = in.readLine()) != null) {
        System.out.println(c);
      }

      in.close();
      socket.close();

    } catch (Exception err) {
      System.out.println(err);
    }
  }
}
