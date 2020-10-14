/** 1からnまでの和を求める */
import java.util.Scanner;

public class ICPJ002 {
  public static void main(String[] args) {
    Scanner SIn = new Scanner(System.in);

    System.out.println("This code sums up 1 to n");

    int sum = 0;

    for (int i = 0; 10 > i; ++i) {
      System.out.print("Please input n: ");
      sum += SIn.nextInt();
    }

    System.out.println(String.format("Sum result: %d", sum));
  }
}
