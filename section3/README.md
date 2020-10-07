# インターネットプログラミング 3講義目

## 標準入力

- `java.util.Scanner`をインポート

- Classを継承。`.nextInt`で入力待機

## 分岐

```java
int a = 10;

if(a > 10){
  System.out.println("> 10");
}else if(a == 10){
  ...
}else {
  ...
}
```

## 演算子

- 基本は他プログラムと一緒

- 特殊なもの

  - `^`: 排他的論理和。`true ^ true = false`, `true ^ false = true`, `false ^ false = false`

  - `?:`: 三項演算子。`条件式? 式1:式2 `

    ```java
    int a = 10;
    int b = 20;
    
    String ans = a == b ? "OK": "NO";
    
    System.out.println(ans);
    ```

## Switch

```java
switch (式) {
  case 定数1:
    ...
    break;
  case 定数2:
    ...
   	break;
}
```

