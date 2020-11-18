// 学籍番号：19nc063氏名：渡邊悠人
// 三角形の面積を求めるプログラム
// 変数名は変更しないこと
import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {
    double base; // 底辺
    double height; // 高さ
    double space; // 面積

    Scanner stdIn = new Scanner(System.in);

    System.out.println("このプログラムは三角形の面積を求めるプログラムです．");

    // 【プログラミング課題１】
    // コメントを参考にキーボードから底辺の長さと高さを入力し，
    // 三角形の面積を求め，画面に面積を出力するプログラムを完成させなさい

    // キーボード入力

    // 底辺の入力を促す
    // 入力された値を底辺の変数に代入

    System.out.print("底辺の長さを入力してください: ");
    base = stdIn.nextDouble();

    // 高さの入力を促す
    // 入力された値を高さの変数に代入

    System.out.print("高さを入力してください: ");
    height = stdIn.nextDouble();

    // 三角形の面積計算を求め面積の変数に代入

    space = base * height / 2;

    // 三角形の面積を表示

    System.out.printf("三角形の面積は%fです。\n", space);
  }
}
