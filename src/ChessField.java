import java.util.Scanner;

public class ChessField {
    public static Scanner scan = new Scanner(System.in);
    public static int a1, a2, b1, b2;

    public static void main(String[] args) {
        a1 = scan.nextInt();
        b1 = scan.nextInt();
        a2 = scan.nextInt();
        b2 = scan.nextInt();

        if (a1 == a2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
