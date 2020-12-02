import java.net.*;

public class InetAddressTest {
  public static void main(String[] args) {
    try {
      InetAddress address = InetAddress.getLocalHost();

      System.out.println("Local Host:");
      System.out.println("\t" + address.getHostName());
      System.out.println("\t" + address.getHostAddress());
    } catch (UnknownHostException e) {
      System.out.println("Unable to determine this host's address.");
    }
  }
}
