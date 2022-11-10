import java.util.Scanner;

public class GoldSand {
    public static Scanner scan = new Scanner(System.in);
    public static int a, b, c, a1, b1, c1, x;

    public static void main(String[] args) {
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        a1 = scan.nextInt();
        b1 = scan.nextInt();
        c1 = scan.nextInt();

        if(a > b) {
            x = a;
            a = b;
            b = x;
        }
        if(b > c) {
            x = b;
            b = c;
            c = x;
        }
        if(a > b) {
            x = a;
            a = b;
            b = x;
        }
        if(a1 > b1) {
            x = a1;
            a1 = b1;
            b1 = x;
        }
        if(b1 > c1) {
            x = b1;
            b1 = c1;
            c1 = x;
        }
        if(a1 > b1) {
            x = a1;
            a1 = b1;
            b1 = x;
        }
        System.out.println(a * a1 + b * b1 + c * c1);
    }
}
