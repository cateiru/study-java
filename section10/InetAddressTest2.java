import java.net.*;

/** InetAddressTest2 */
public class InetAddressTest2 {

  public static void main(String[] args) {
    for (int i = 0; i < args.length; ++i) {
      try {
        InetAddress[] addressList = InetAddress.getAllByName(args[i]);
        System.out.println(args[i] + ":");
        System.out.println("\t" + addressList[0].getHostName());

        for (int j = 0; j < addressList.length; ++j) {
          System.out.println("\t" + addressList[j].getHostAddress());
        }

      } catch (UnknownHostException e) {
        System.out.println("Unable to find address for: " + args[i]);
      }
    }
  }
}
