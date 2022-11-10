import java.util.Scanner;

public class BinarySearch {
    public static Scanner scan = new Scanner(System.in);
    public static double a;
    public static int x;

    public static void main(String[] args) {
        a = scan.nextInt();

        for (int i = 0; i < a; i++) {
            a /= 2;
            x++;
            System.out.println(x);
        }
    }
}
