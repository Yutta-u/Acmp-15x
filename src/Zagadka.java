import java.util.Scanner;

public class Zagadka {
    public static Scanner scan = new Scanner(System.in);
    public static int a, b;
    public static int x;

    public static void main(String[] args) {
        a = scan.nextInt();
        b = scan.nextInt();

        for (int i = 1; i <= 10000; i++) {
            x = a - i;
            if (i <= x && i * x == b)
                System.out.println(i + " " + x);
        }
    }
}
