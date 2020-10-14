public class ICPJ004 {
  public static void main(String[] args) {
    int[] a = new int[5];

    for (int i = 0; a.length > i; ++i) {
      a[i] = i + 1;
    }

    for (int i = 0; a.length > i; ++i) {
      System.out.println(a[i]);
    }
  }
}
