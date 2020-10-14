import java.util.Scanner;

public class ICPJ005 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("Please set the number of array emelemts: ");
    int arrayLength = stdIn.nextInt();

    int[] box = new int[arrayLength];

    for (int i = 0; box.length > i; ++i) {
      System.out.printf("index of %d. please number: ", i + 1);
      box[i] = stdIn.nextInt();
    }

    System.out.println("The array elements are set as followings");

    for (int i = 0; box.length > i; ++i) {
      System.out.printf("index of %d: %d\n", i + 1, box[i]);
    }
  }
}
