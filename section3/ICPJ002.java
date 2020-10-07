
/**
 * 入力した数値が正か負かを判定するプログラム
 */
import java.util.Scanner;

public class ICPJ002 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("input number: ");
        int inNumber = stdIn.nextInt();

        if (inNumber >= 0) {
            System.out.println(inNumber + " is positive");
        } else {
            System.out.println(inNumber + " is negative");
        }
    }
}
