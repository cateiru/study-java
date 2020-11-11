// 自動車クラス Car

class Car {
  private String name; // 名前
  private int width; // 幅
  private int height; // 高さ
  private int length; // 長さ
  private double x; // 現在位置X座標
  private double y; // 現在位置Y座標
  private double fuel; // 残燃料

  // ---コンストラクタ---//
  Car(String _name, int _width, int _height, int _length, double _fuel) {
    this.name = _name;
    this.width = _width;
    this.height = _height;
    this.length = _length;
    this.fuel = _fuel;
    this.x = this.y = 0.0;
  }

  double getX() {
    return this.x;
  } // 現在位置のX座標を取得するメソッド

  double getY() {
    return this.y;
  } // 現在位置のY座標を取得するメソッド

  double getFuel() {
    return this.fuel;
  } // 残燃料を取得するメソッド

  // --- 自動車の仕様を表示するメソッド---//
  void putSpec() {
    System.out.println("車名 : " + this.name);
    System.out.println("車幅 : " + this.width + "mm");
    System.out.println("車高 : " + this.height + "mm");
    System.out.println("車長 : " + this.length + "mm");
  }

  // --- X軸方向にdx, Y軸方向にdy に動かすメソッド ---//
  boolean move(double dx, double dy) {
    double dist = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2)); // 移動距離
    if (dist <= this.fuel) {
      this.fuel -= dist; // 移動距離の分だけ
      this.x += dx;
      this.y += dy;
      return true; // 移動完了
    }
    return false; // 燃料不足で移動できない
  }
}
