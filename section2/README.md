# インターネットプログラミング 2講義目

## Java?

- 1990年にサン・マイクロシステムズが開発
  - ブラウザ上で動く言語として脚光を浴びる（Java applet）
  - その後、進化を遂げ現在は様々なアプリケーション開発に活用
  - 2019年、Javaを活用している人は7600万人いると言われている。（Pythonはもっと多い）

- 特徴
  - **Write once, Run anywhere!**
  - C, C++ライクな構文
  - 多くのライブラリ、APIを提供
  - 元来無料だったがオラクル社がライセンスポリシーを変更、オリジナルJavaは商用利用は有料に

## Hello World

```java
class Hello {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

- `class name`
  - クラス宣言
  - ファイル名とclass名は同じにする
- `public static void main(String[] args)`
  - メソッド宣言
- `System.out.println("Hello World");`
  - statement文
  - `System.out`
    - プログラムとコンソールをつなぐストリーム
  - `println`
    - 末尾改行

## 変数の命名規則

- Unicodeに含まれる文字が可能。
  - 日本語
  - 記号は`_`, `$`のみ
- 1文字目に数字はダメ
- 大文字小文字は区別
- 文字数制限なし

## リテラル

- 文字リテラル
  - シングルクォーテーション
- 文字列リテラル
  - ダブルクオーテーション
- 整数リテラル
  - 2, 8, 10, 16進数で表現可能
  - **L**を末尾につけるとlong型（サフィックス）

- 浮動小数点数リテラル
  - **D**ならdouble型（サフィックス）
  - **F**ならfloat型（サフィックス）

## 標準入力

```java
import java.util.Scanner;

// classの呼び出し
Scanner stdIn = new Scanner(System.in);

int x = stdIn.nextInt();
```

## Formated String

```java
int a = 10;

String b = String.format("number : %d", a);

System.out.println(b);
```

|  型  |                概要                |
| :--: | :--------------------------------: |
| b, B |              ブール値              |
| h, H |    ハッシュコードを16進数に変換    |
| s, S |               文字列               |
| c, C |            Unicode文字             |
|  d   |              10進整数              |
|  o   |              8進整数               |
| x, X |              16進整数              |
| e, E |      浮動小数点数形式の10進数      |
|  f   |            10進小数点数            |
| t, T |     日付／時刻変換文字の接頭辞     |
|  %   |        リテラル’%’（u0025）        |
|  N   | プラットフォーム固有の行区切り文字 |

