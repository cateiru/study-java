/* ファイルへの出力 */
import java.io.*;

public class FileOut1 {
  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("test.txt");
      fw.write("This is a test.");
      fw.close();
    } catch (IOException e) {
      System.err.println("File can't write.");
    }
  }
}
