import java.util.Scanner;

public class Palatki {
    public static Scanner scan = new Scanner(System.in);
    public static int a1, a2, a3;
    public static int b1, b2, b3;
    public static int k, w;
    public static int x;
    public static int y;

    public static void main(String[] args) {
        k = scan.nextInt();
        w = scan.nextInt();
        a1 = scan.nextInt();
        b1 = scan.nextInt();
        a2 = scan.nextInt();
        b2 = scan.nextInt();
        a3 = scan.nextInt();
        b3 = scan.nextInt();

        if (a1 > a2) {
            x = a1;
            a1 = a2;
            a2 = x;
        }
        if (a2 > a3) {
            x = a2;
            a2 = a3;
            a3 = x;
        }
        if (a1 > a2) {
            x = a1;
            a1 = a2;
            a2 = x;
        }
        if (b1 > b2) {
            y = b1;
            b1 = b2;
            b2 = y;
        }
        if (b2 > b3) {
            y = b2;
            b2 = b3;
            b3 = y;
        }
        if (b1 > b2) {
            y = b1;
            b1 = b2;
            b2 = y;
        }

        if (x < y && a1 <= b1 && a2 <= b2 && a3 <= b3
                && a1 + a2 + a3 <= w && b1 + b2 + b3 >= k)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
