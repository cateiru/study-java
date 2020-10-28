import java.util.Scanner;

class Bank {
  private String name;
  private String number;
  private long balance;

  Bank(String _name, String _number, long _balance) {
    name = _name;
    number = _number;
    balance = _balance;
  }

  String get_name() {
    return name;
  }

  String get_number() {
    return number;
  }

  long get_balance() {
    return balance;
  }

  void deposit(long money) {
    balance += money;
  }

  void withdrawal(long money) {
    if (balance < money) {
      throw new IndexOutOfBoundsException("引き出す金額が残高より多いです。");
    }
    balance -= money;
  }
}

public class training {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.printf("ユーザー数を入力してください。\n >>> ");
    int length = stdIn.nextInt();

    Bank[] banks = new Bank[length];

    for (int i = 0; length > i; ++i) {
      System.out.printf("お客様(User%d)の口座情報を入力してください。\n", i);
      System.out.print("お名前: ");
      String name = stdIn.next();
      System.out.print("口座番号: ");
      String number = stdIn.next();
      System.out.print("預金残高: ");
      long balance = stdIn.nextLong();
      System.out.println("-------------");

      banks[i] = new Bank(name, number, balance);
    }

    // this section is Exercises.
    banks[0].withdrawal(3000);
    banks[1].deposit(5000);
    // so far

    for (int i = 0; length > i; ++i) {
      System.out.printf("*** User%d の口座情報 ***\n", i);
      System.out.printf("  口座名義: %s\n", banks[i].get_name());
      System.out.printf("  口座番号: %s\n", banks[i].get_number());
      System.out.printf("  預金残高: %d\n", banks[i].get_balance());
    }
  }
}
