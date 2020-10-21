import java.util.Scanner;

class ICPJ017 {

  static int maxSelect(int[] data) {
    int maxData = data[0];
    for (int i = 1; data.length > i; ++i) {
      maxData = Math.max(maxData, data[i]);
    }
    return maxData;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int[] height = new int[3]; // 身長用の配列定義
    int[] weight = new int[3]; // 体重用の配列定義
    int[] age = new int[3]; // 年齢用の配列定義

    for (int i = 0; i < 3; i++) {
      System.out.print("[" + (i + 1) + "] ");
      System.out.print("Please input his/her hight : ");
      height[i] = stdIn.nextInt();
      System.out.print("Please input his/her weight: ");
      weight[i] = stdIn.nextInt();
      System.out.print("Please input his/her age : ");
      age[i] = stdIn.nextInt();
    }
    System.out.println("The maximum hight is " + maxSelect(height));
    System.out.println("The maximum weight is " + maxSelect(weight));
    System.out.println("The maximum age is " + maxSelect(age));
  }
}
