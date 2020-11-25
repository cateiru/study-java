/** ICPJ001 */
// import java.util.Scanner;
import java.util.*;

public class ICPJ001 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("円の面積を求めるプログラムです。");
    System.out.print("半径を入力してください :");
    double r = stdIn.nextDouble();

    System.out.printf("面積は%fです。\n", Math.PI * r * r);
  }
}
