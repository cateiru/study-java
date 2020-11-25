import java.util.InputMismatchException;
import java.util.Scanner;

public class ICPJ003 {
  public static void main(String[] args) {
    input();
  }

  public static void input() {
    Scanner stdIn = new Scanner(System.in);
    int a = 0, b = 0;
    try {
      System.out.print("整数aを入力してください: ");
      a = stdIn.nextInt();
      System.out.print("整数bを入力してください: ");
      b = stdIn.nextInt();
    } catch (InputMismatchException e) {
      Scanner _stdIn = new Scanner(System.in);
      System.out.println("エラー: " + e);
      System.out.print("再入力しますか？ Y=>1/N=>0: ");
      int yOrn = _stdIn.nextInt();
      if (yOrn == 1) {
        input();
      }
      System.exit(0);
    }
    mul(a, b);
    div(a, b);
  }

  public static void mul(int a, int b) {
    System.out.println("a * b = " + (a * b));
  }

  public static void div(int a, int b) {
    System.out.println("a / b = " + (a / b));
  }
}
