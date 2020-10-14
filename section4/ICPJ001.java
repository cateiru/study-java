/** 入力した数値から0まで-1ずつ出力 */
import java.util.Scanner;

public class ICPJ001 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("Start Countdown.");
    int x;

    do {
      System.out.print("Please input a number: ");
      x = stdIn.nextInt();
    } while (x <= 0);

    while (x >= 0) {
      System.out.println(x);
      x--;
    }
  }
}
