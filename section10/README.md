# インターネットプログラミング 10講義目

## ソケット

TCP、UDPなどの通信の終端。**特定のポート番号と関連づけられる**。

## InetAddress Class

```java
// 引数: ホスト名、IPアドレス
// 返り値: InetAddressのインスタンス
getByName()

// 上に同じ
getAllByName()

// 返り値: ローカルホストアドレスが含まれるインスタンス
getLocalHost()
```
