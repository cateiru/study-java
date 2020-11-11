import java.util.Scanner;

public class CarMove {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    Car myCar;

    System.out.println("---- Please input spec of car ----");
    System.out.print("* Name? : ");
    String name = stdIn.next();
    System.out.print("* Car Width? : ");
    int width = stdIn.nextInt();
    System.out.print("* Car Height? : ");
    int height = stdIn.nextInt();
    System.out.print("* Car Length? : ");
    int length = stdIn.nextInt();
    System.out.print("* Fuel? : ");
    double fuel = stdIn.nextDouble();
    System.out.println();

    myCar = new Car(name, width, height, length, fuel);

    System.out.println("---- Your Car spec ----");
    myCar.putSpec();
    System.out.println();

    while (true) {
      putPositionFuel(myCar);
      System.out.print("Move? 0: No, 1: Yes  :");
      int isMove = stdIn.nextInt();
      if (isMove == 1) {
        System.out.print("dx? :");
        double dx = stdIn.nextDouble();
        System.out.print("dy? :");
        double dy = stdIn.nextDouble();
        boolean isSuccess = myCar.move(dx, dy);
        if (!isSuccess) {
          System.out.println("Fuel shortage!!!!");
          break;
        }
      } else {
        break;
      }
    }
  }

  static void putPositionFuel(Car myCar) {
    System.out.println("---- Current position and Fuel ----");
    System.out.printf("* 位置: (%.3f, %.3f)\n", myCar.getX(), myCar.getY());
    System.out.printf("* 燃料: %.2f\n", myCar.getFuel());
    System.out.println();
  }
}
