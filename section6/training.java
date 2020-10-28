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

class BankOperation {
  private Bank[] banks = new Bank[1000];
  private int user;

  BankOperation() {
    user = 0;
  }

  void add_user(String name, String number, long balance) {
    if (user >= 1) {
      for (int i = 0; user > i; ++i) {
        if (banks[i].get_number() == number) {
          throw new IllegalArgumentException("同じ口座番号のユーザーがすでに存在しています。");
        }
      }
    }
    banks[user] = new Bank(name, number, balance);
    user++;
  }

  String[] get_names() {
    String[] names = new String[user];
    for (int i = 0; user > i; ++i) {
      names[i] = banks[i].get_name();
    }

    return names;
  }

  String[] get_numbers() {
    String[] numbers = new String[user];
    for (int i = 0; user > i; ++i) {
      numbers[i] = banks[i].get_number();
    }

    return numbers;
  }

  long[] get_balances() {
    long[] balances = new long[user];
    for (int i = 0; user > i; ++i) {
      balances[i] = banks[i].get_balance();
    }

    return balances;
  }

  String get_name(int index) {
    check_user(index);
    return banks[index].get_name();
  }

  String get_number(int index) {
    check_user(index);
    return banks[index].get_number();
  }

  long get_balance(int index) {
    check_user(index);
    return banks[index].get_balance();
  }

  void deposit(long money, int index) {
    check_user(index);
    banks[index].deposit(money);
  }

  void withdrawal(long money, int index) {
    check_user(index);
    banks[index].withdrawal(money);
  }

  void transaction(String from_number, String send_number, long money) {
    int from_index = check_number(from_number);
    int send_index = check_number(send_number);

    withdrawal(money, from_index);
    deposit(money, send_index);
  }

  int get_user() {
    return user;
  }

  private int check_number(String number) {
    for (int i = 0; user > i; ++i) {
      if (banks[i].get_number() == number) {
        return i;
      }
    }
    throw new IndexOutOfBoundsException("指定されたユーザーは存在しません。");
  }

  private void check_user(int index) {
    if (index > (user - 1)) {
      throw new IndexOutOfBoundsException("指定されたユーザーは存在しません。");
    }
  }
}

public class training {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.printf("ユーザー数を入力してください。\n >>> ");
    int length = stdIn.nextInt();

    BankOperation op = new BankOperation();

    for (int i = 0; length > i; ++i) {
      System.out.printf("お客様(User%d)の口座情報を入力してください。\n", i);
      System.out.print("お名前: ");
      String name = stdIn.next();
      System.out.print("口座番号: ");
      String number = stdIn.next();
      System.out.print("預金残高: ");
      long balance = stdIn.nextLong();
      System.out.println("-------------");

      op.add_user(name, number, balance);
    }

    // this section is Exercises.
    op.withdrawal(3000, 0);
    op.deposit(5000, 1);
    // so far

    String[] names = op.get_names();
    String[] numbers = op.get_numbers();
    long[] balances = op.get_balances();

    for (int i = 0; op.get_user() > i; ++i) {
      System.out.printf("*** User%d の口座情報 ***\n", i);
      System.out.printf("  口座名義: %s\n", names[i]);
      System.out.printf("  口座番号: %s\n", numbers[i]);
      System.out.printf("  預金残高: %d\n", balances[i]);
    }
  }
}
