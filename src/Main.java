import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static int[] m;
    public static int a;
    public static int b;
    public static void main(String[] args) {
        a = scan.nextInt();
        m = new int[a];

        for (int i = 0; i < a; i++)
            m[i] = scan.nextInt();

        b = scan.nextInt();
        int m2[][] = new int[b][2];

        for (int i = 0; i < b; i++) {
            m2[i][0] = scan.nextInt() - 1;
            m2[i][1] = scan.nextInt() - 1;
        }
        for (int i = 0; i < b; i++)
            for ( int g = m2[i][0];g <= m2[i][1]; g++)
                System.out.println(m[g] + " ");
        System.out.println();
    }
}