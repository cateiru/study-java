// 学籍番号：19nc064 氏名：渡邊悠人
import java.util.*;

public class MemberInDisp {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    GregorianCalendar gcalendar = new GregorianCalendar();

    int year = gcalendar.get(Calendar.YEAR);
    int month = gcalendar.get(Calendar.MONTH) + 1;
    int date = gcalendar.get(Calendar.DATE);

    String name;
    int no;
    int birthday_year;
    int birthday_month;
    int birthday_date;
    int age;
    String tel;

    System.out.println("会員の情報を入力してください");
    System.out.println("但し、苗字と指名の間にスペースをいれないこと");
    System.out.println();

    System.out.print("名前を入力してください: ");
    name = stdIn.next();
    System.out.print("会員番号を入力してください: ");
    no = stdIn.nextInt();
    System.out.print("生まれた年を入力してください: ");
    birthday_year = stdIn.nextInt();
    System.out.print("生まれた月を入力してください: ");
    birthday_month = stdIn.nextInt();
    System.out.print("生まれた日付を入力してください: ");
    birthday_date = stdIn.nextInt();
    System.out.print("電話番号を入力してください: ");
    tel = stdIn.next();

    if (birthday_month < 1 || birthday_month > 12) {
      throw new Error("月は1~12の範囲で入力してください。");
    }
    if (birthday_date < 1 || birthday_date > 31) {
      throw new Error("日付は1~31の範囲で入力してください。");
    }

    age = year - birthday_year;

    if (month < birthday_month || (month == birthday_month && date < birthday_date)) {
      age--;
    }

    Member menberData = new Member(name, no, age, tel);

    menberData.print();
  }
}
