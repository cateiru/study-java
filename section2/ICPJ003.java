public class ICPJ003 {
    public static void printXY(int x, int y) {
        System.out.println("x=" + x);
        System.out.println("y=" + y);

        System.out.println("------");
        System.out.println("The sum of x and y is " + (x + y));
        System.out.println("The average of x and y is " + ((x + y) / 2));

    }

    public static void main(String[] args) {
        int x;
        int y;

        x = 1;
        y = 10;

        printXY(x, y);
    }
}
