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