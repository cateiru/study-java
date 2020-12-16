import java.io.*;

public class FileIn1 {
  public static void main(String[] args) {
    try {
      FileReader fr = new FileReader("test.txt");
      int c;
      while ((c = fr.read()) != -1) {
        System.out.print((char) c);
      }
      fr.close();
    } catch (IOException e) {
      System.err.println("File can't read.");
    }
  }
}
