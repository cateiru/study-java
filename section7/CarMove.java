import java.util.Scanner;

public class CarMove {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    Car myCar;

    System.out.println("---- 車のスペックを入力 ----");
    System.out.print("* 名前? : ");
    String name = stdIn.next();
    System.out.print("* 車幅? : ");
    int width = stdIn.nextInt();
    System.out.print("* 車高? : ");
    int height = stdIn.nextInt();
    System.out.print("* 車長? : ");
    int length = stdIn.nextInt();
    System.out.print("* 燃料? : ");
    double fuel = stdIn.nextDouble();
    System.out.println();

    myCar = new Car(name, width, height, length, fuel);

    System.out.println("---- あなたの車のスペック ----");
    myCar.putSpec();
    System.out.println();

    while (true) {
      putPositionFuel(myCar);
      System.out.print("動かす? 0: いいえ, 1: はい  :");
      int isMove = stdIn.nextInt();
      if (isMove == 1) {
        System.out.print("X座標にどれくらい? :");
        double dx = stdIn.nextDouble();
        System.out.print("Y座標にどれくらい? :");
        double dy = stdIn.nextDouble();
        boolean isSuccess = myCar.move(dx, dy);
        if (!isSuccess) {
          System.out.println("燃料が足りない！！");
          break;
        }
      } else {
        break;
      }
    }
  }

  static void putPositionFuel(Car myCar) {
    System.out.println("---- 現在の車の位置と燃料 ----");
    System.out.printf("* 位置: (%.3f, %.3f)\n", myCar.getX(), myCar.getY());
    System.out.printf("* 燃料: %.2f\n", myCar.getFuel());
    System.out.println();
  }
}
