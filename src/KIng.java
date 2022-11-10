import java.util.Scanner;

public class KIng {
    public static Scanner scan = new Scanner(System.in);
    public static int a, a1;
    public static int b, b1;

    public static void main(String[] args) {
        a = scan.nextInt();
        b = scan.nextInt();
        a1 = scan.nextInt();
        b1 = scan.nextInt();

        if (a1 == a - 1 && b1 == b - 1 || a1 == a + 1 && b1 == b + 1
            || a1 == a + 1 && b1 == b - 1 || a1 == a - 1 && b1 == b + 1
            || a1 == a + 1 && b1 == b || a1 == a - 1 && b1 == b
            || a1 == a && b1 == b + 1 || a1 == a && b1 == b - 1) {
            System.out.println("YES");
        } else
            System.out.println("NO");

    }
}