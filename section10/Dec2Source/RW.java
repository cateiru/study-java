// RW.java
// キーボードからの入力を受け取り,そのまま画面に出力するプログラム
// このプログラムを終了するには,コントロールＣを入力してください
import java.io.*;

public class RW {
  public static void main(String[] args) {
    byte[] buff = new byte[1024]; // 配列の定義
    while (true) { // 以下のループを無限に繰り返します
      try {
        int n = System.in.read(buff); // System.inからの読み込み
        System.out.write(buff, 0, n); // System.outへの書き出し
      }
      // 例外処理
      catch (Exception e) {
        System.exit(1); // 例外時はプログラムを終了します
      }
    }
  }
}
