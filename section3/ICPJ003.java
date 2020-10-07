
/**
 * キーボードから1つの整数値を読み込み、正の値であるとき奇数か偶数かを表示する
 */
import java.util.Scanner;

public class ICPJ003 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("input number: ");
        int inNumber = stdIn.nextInt();

        if (inNumber >= 0) {
            if (inNumber % 2 == 0) {
                System.out.println(inNumber + " is even");
            } else {
                System.out.println(inNumber + " is odd.");
            }
        }
    }
}
