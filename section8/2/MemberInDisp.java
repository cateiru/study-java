// 学籍番号：19nc064 氏名：渡邊悠人
import java.util.*;

public class MemberInDisp {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    String name;
    int no;
    int age;
    String tel;

    System.out.println("会員の情報を入力してください");
    System.out.println("但し、苗字と指名の間にスペースをいれないこと");
    System.out.println();

    System.out.print("名前を入力してください: ");
    name = stdIn.next();
    System.out.print("会員番号を入力してください: ");
    no = stdIn.nextInt();
    System.out.print("年齢入力してください: ");
    age = stdIn.nextInt();
    System.out.print("電話番号を入力してください: ");
    tel = stdIn.next();

    Member menberData = new Member(name, no, age, tel);

    menberData.print();
  }
}
