// Wfile.java
// キーボードからの入力を受け取り,そのまま画面に出力，かつファイルにデータを追記
// 使い方java Writefile ファイル名
// このプログラムを終了するには,行の先頭にピリオド.を入力してください
import java.io.*;
public class Wfile {
	public static void main(String[] args){
		byte[] buff = new byte[1024];//配列の定義
		boolean cont = true ;// ループ制御用変数
        FileOutputStream outfile = null;// ファイル出力用オブジェクト．
        //オブジェクトoutfileを作り,ファイルの出力を用意
		try{
			outfile = new FileOutputStream(args[0]) ;
		}
		catch(FileNotFoundException e){
			System.err.println("ファイルがありません");// ファイル準備の失敗
			System.exit(1) ;
		}
		// 行頭へのピリオドの入力まで,以下のループを繰り返す
		while (cont) {
			try {
				int n = System.in.read(buff);// System.inからの読み込み
				System.out.write(buff, 0, n);// System.outへの書き出し
				if(buff[0] == '.') cont = false;// 行頭ピリオドの検出
				else outfile.write(buff,0,n) ;
			}
			// 例外処理です
			catch(Exception e){
				System.exit(1);
			}
		}
		// ファイルを閉じます
		try{
			outfile.close() ;
		}
		catch(IOException e){
			// ファイルクローズの失敗です
			System.err.println("ファイルのエラーです") ;
			System.exit(1) ;
		}
	}
}