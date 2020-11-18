// 学籍番号：19nc064 氏名：渡邊悠人
// --- 会員管理クラス ---//

class Member {
  // フィールド（インスタンス変数）
  private String name; // 名前
  private int no; // 会員番号
  private int age; // 年齢
  private String phone; // 電話番号

  // コンストラクタ
  Member(String name, int no, int age, String phone) {
    //
    // 【プログラミング課題２】引数で受け取った値でインスタンス変数を
    // 初期化するコンストラクタを完成させよ.
    //
    this.name = name;
    this.no = no;
    this.age = age;
    this.phone = phone;
  }

  void print() {
    System.out.println();
    System.out.println("照会のあった会員情報は以下の通りです．");
    System.out.println("No." + no + " : " + name + "(" + age + "歳)  Tel :" + phone);
  }
}
