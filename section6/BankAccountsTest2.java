// 銀行口座書き換え版その１

// 銀行口座クラス
class BankAccount2 {
  private String name; // 口座名義`
  private String no; // 口座番号
  private long balance; // 預金残高

  // --- コンストラクタ ---//
  BankAccount2(String n, String num, long z) {
    name = n; // 口座名義`
    no = num; // 口座番号
    balance = z; // 預金残高
  }

  // --- 口座名義を確認するメソッド---//
  String getName() {
    return name;
  }
  // --- 口座番号を確認するメソッド---//
  String getNo() {
    return no;
  }
  // --- 預金残高を確認するメソッド---//
  long getBalance() {
    return balance;
  }
  // --- 入金メソッド---//
  void deposit(long k) {
    balance += k;
  }
  // --- 出勤メソッド---//
  void withdraw(long k) {
    balance -= k;
  }
}

// 銀行口座クラスを操作するクラスその２
class BankAccountsTest2 {

  public static void main(String[] args) {

    // 相田くんの口座クラス宣言文
    BankAccount2 aida = new BankAccount2("相田一郎", "123456", 10000);
    // 飯田くんの口座クラス宣言文
    BankAccount2 iida = new BankAccount2("飯田次郎", "654321", 2000);

    aida.withdraw(2000); // 2000円引き出す
    iida.deposit(1000); // 1000円預ける

    System.out.println("■相田さんの口座情報");
    System.out.println("　口座名義" + aida.getName());
    System.out.println("　口座番号" + aida.getNo());
    System.out.println("　預金残高" + aida.getBalance());

    System.out.println("■飯田さんの口座情報");
    System.out.println("　口座名義" + iida.getName());
    System.out.println("　口座番号" + iida.getNo());
    System.out.println("　預金残高" + iida.getBalance());
  }
}
