import java.util.Scanner;

public class Nod {
    public static Scanner scan = new Scanner(System.in);
    public static long a, b;

    public static void main(String[] args) {
        a = scan.nextInt();
        b = scan.nextInt();

        if (a < b) {
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
        }
        for (int i = 0; i < b; i++){
            long x = b;
            b = a % b;
            a = x;
        }
        System.out.println(a);
    }
}
