import java.util.*;

public class ICPJ005 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int number_1;
        int number_2;
        int number_3;
        int average = 0;

        System.out.print("please input number (1/3): ");
        number_1 = stdIn.nextInt();
        System.out.print("please input number (2/3): ");
        number_2 = stdIn.nextInt();
        System.out.print("please input number (3/3): ");
        number_3 = stdIn.nextInt();

        average = (number_1 + number_2 + number_3) / 3;

        System.out.println(String.format("average of : %d", average));

    }
}
