/** 3つの入力の最大値を出力する。 */
import java.util.Scanner;

public class ICPJ001 {
  static int max2(int a, int b, int c) {
    return Math.max(Math.max(a, b), c);
  }

  public static void main(String[] args) {
    Scanner sIn = new Scanner(System.in);

    System.out.print("Please input int a: ");
    int a = sIn.nextInt();
    System.out.print("Please input int b: ");
    int b = sIn.nextInt();
    System.out.print("Please input int c: ");
    int c = sIn.nextInt();

    System.out.printf("The most significant number is %d\n", max2(a, b, c));
  }
}
