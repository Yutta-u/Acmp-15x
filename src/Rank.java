import java.util.Scanner;

public class Rank { // шеренга
    public static Scanner scan = new Scanner(System.in);
    public static int[] array;
    public static int i, n, a;

    public static void main(String[] args) {
        n = scan.nextInt();
        array = new int[n];

        for (i = 0; i < n; i++)
            array[i] = scan.nextInt();
        a = scan.nextInt();

        for (i = 0; i < n; i++)
            if (array[i] < a) {
                break;
            }
        System.out.println(i + 1);
    }
}
