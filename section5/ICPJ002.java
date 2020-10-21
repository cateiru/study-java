import java.util.Scanner;

public class ICPJ002 {
  static double power(double x, int n) {
    double tmp = 1.;

    // while (n-- > 0) {
    //   tmp *= x;
    // }

    for (int i = 0; n > i; ++i) {
      tmp *= x;
    }
    return tmp;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("This program calculates to the b-th power");
    System.out.print("Please input a real number a:");
    double a = stdIn.nextDouble();
    System.out.print("Please input an int b:");
    int b = stdIn.nextInt();

    System.out.printf("%f to %d-th power is %f\n", a, b, power(a, b));
  }
}
