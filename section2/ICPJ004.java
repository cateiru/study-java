import java.util.Scanner;

public class ICPJ004 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Input x : ");
        int x = stdIn.nextInt();

        System.out.print("Input y : ");
        int y = stdIn.nextInt();

        int sum = x + y;
        System.out.println(x + " + " + y + " = " + sum);

    }
}
