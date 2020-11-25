import java.util.InputMismatchException;
import java.util.Scanner;

public class ICPJ002 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int a = 0;
    int b = 1;

    System.out.print("整数値を入力してください(1): ");
    try {
      a = stdIn.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("入力エラー発生: " + e);
      System.exit(1);
    }

    System.out.print("整数値を入力してください(2): ");
    try {
      b = stdIn.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("入力エラー発生: " + e);
      System.exit(1);
    }

    try {
      System.out.printf("積: %d, 商: %d\n", a * b, a / b);
    } catch (ArithmeticException e) {
      System.out.println("ゼロ除算エラー: " + e);
      System.exit(1);
    }
  }
}
