import java.util.Scanner;

public class Simmetry {
    public static Scanner scan = new Scanner(System.in);
    public static long a1, a2, b1, b2, x1, x2;
    public static long y1, y2;

    public static void main(String[] args) {
        a1 = scan.nextInt();
        b1 = scan.nextInt();
        a2 = scan.nextInt();
        b2 = scan.nextInt();
        x1 = scan.nextInt();
        x2 = scan.nextInt();

        if (a1 == a2) {
            y1 = 2 * a1 - x1;
            y2 = x2;
        }
        if (b1 == b2) {
            y1 = x1;
            y2 = 2 * b1 - x2;
        }
        System.out.println(y1 + " " + y2);
    }
}
