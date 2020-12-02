// Rfile.java
// ファイルの内容を読み取り,そのまま画面に出力
// 使い方java Readfile ファイル名
import java.io.*;

public class Rfile {
  public static void main(String[] args) {
    byte[] buff = new byte[1024]; // 配列の定義
    boolean cont = true; // ループ制御用変数
    FileInputStream infile = null; // ファイル読取用
    // オブジェクトinfileを作り,ファイル読み出しを準備します
    try {
      infile = new FileInputStream(args[0]);
    } catch (FileNotFoundException e) {
      System.err.println("ファイルがありません");
      System.exit(1);
    }
    // ファイルの終了まで,以下のループを繰り返します
    while (cont) {
      try {
        int n = infile.read(buff); // ファイルからの読み込み
        System.out.println(n);
        if (n != -1) {
          System.out.write(buff, 0, n); // System.outへの書き出し
        } else {
          cont = false;
        }
      } catch (IOException e) {
        System.out.print(e);
        System.exit(1);
      }
    }
    // ファイルを閉じる
    try {
      infile.close();
    } catch (IOException e) {
      // ファイルを閉じる際の失敗
      System.err.println("ファイルのエラーです");
      System.exit(1);
    }
  }
}
