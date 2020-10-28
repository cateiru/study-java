// 銀行口座を扱うプログラム

class BankAccounts {

  public static void main(String[] args) {
    String aidaAccountName = "相田一郎"; // 相田さんの口座名義
    String aidaAccountNo = "123456"; // 相田さんの口座番号
    long aidaAccountBalance = 10000; // 相田さんの預金残高

    String iidaAccountName = "飯田次郎"; // 飯田さんの口座名義`
    String iidaAccountNo = "654321"; // 飯田さんの口座番号
    long iidaAccountBalance = 2000; // 飯田さんの預金残高

    aidaAccountBalance -= 2000; // 相田さんが2000円引き出す
    iidaAccountBalance += 1000; // 飯田さんが1000円預ける

    System.out.println("相田さんの口座");
    System.out.println("口座名義 : " + aidaAccountName);
    System.out.println("口座番号 : " + aidaAccountNo);
    System.out.println("預金残高 : " + aidaAccountBalance + "円");

    System.out.println("飯田さんの口座");
    System.out.println("口座名義 : " + iidaAccountName);
    System.out.println("口座番号 : " + iidaAccountNo);
    System.out.println("預金残高 : " + iidaAccountBalance + "円");
  }
}
