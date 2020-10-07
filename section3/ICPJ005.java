/** Switch */
import java.util.Scanner;

public class ICPJ005 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("Please select your hand by the following numbers.");
    System.out.println("0: Rock / 1: Paper / 2: Scissors");
    int select = stdIn.nextInt();

    switch (select) {
      case 0:
        System.out.println("Rock");
        break;
      case 1:
        System.out.println("Paper");
        break;
      case 2:
        System.out.println("Scissors");
        break;
      default:
        System.out.println("Error: input number is 0, 1 or 2.");
        break;
    }
  }
}
