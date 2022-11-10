import java.util.Scanner;

public class Sum {
    public static Scanner scan = new Scanner(System.in);
    public static int firstNum, lastNum, a;
    public static int x;
    public static void main(String[] args) {
        x = scan.nextInt();

        if (x < 1) {
            firstNum = x;
            lastNum = 1;
        } else {
            firstNum = 1;
            lastNum = x;
        }
        for (int i = firstNum; i <= lastNum; i++)
            a += i;

        System.out.println(a);
    }
}