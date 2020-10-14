/** 九九を出力 */
public class ICPJ003 {
  public static void main(String[] args) {
    int height = 0;
    int width = 0;
    int max = 9;

    for (height = 0; (max + 1) > height; ++height) {
      for (width = 0; (max + 1) > width; ++width) {
        System.out.printf("%d\t", height * width);
      }
      System.out.println();
    }
  }
}
