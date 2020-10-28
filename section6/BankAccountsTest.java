// 銀行口座書き換え版その１

// 銀行口座クラス
class BankAccount {
  String name; // 口座名義
  String no; // 口座番号
  long balance; // 口座残高
}

// 銀行口座クラスを操作するクラス
class BankAccountsTest {

  public static void main(String[] args) {
    BankAccount aida = new BankAccount(); // 相田さんの口座
    BankAccount iida = new BankAccount(); // 飯田さんの口座

    aida.name = "相田一郎"; // 相田さんの口座名義
    aida.no = "123456"; // 相田さんの口座番号
    aida.balance = 10000; // 相田さんの預金残高

    iida.name = "飯田次郎"; // 飯田さんの口座名義
    iida.no = "654321"; // 飯田さんの口座番号
    iida.balance = 2000; // 飯田さんの預金残高

    aida.balance -= 2000; // 相田さんが2000円引き出す
    iida.balance += 1000; // 飯田さんが1000円預ける

    System.out.println("相田さんの口座");
    System.out.println("口座名義 : " + aida.name);
    System.out.println("口座番号 : " + aida.no);
    System.out.println("預金残高 : " + aida.balance + "円");

    System.out.println("飯田さんの口座");
    System.out.println("口座名義 : " + iida.name);
    System.out.println("口座番号 : " + iida.no);
    System.out.println("預金残高 : " + iida.balance + "円");
  }
}
