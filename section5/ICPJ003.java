public class ICPJ003 {
  static int x = 1;

  static void printX() {
    System.out.printf("x = %d\n", x);
  }

  public static void main(String[] args) {
    System.out.printf("x = %d\n", x);

    int x = 2;

    System.out.printf("x = %d\n", x);
    System.out.printf("Scope.x = %d\n", ICPJ003.x);

    printX();
  }
}
