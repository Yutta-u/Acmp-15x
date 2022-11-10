import java.util.Scanner;

public class Afsd {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
            numbers[i] = i + 1;

        int j = 0;
        for (int i = a - 1; i < (b - a) / 2 + a; i++) {
            j++;
            int x = numbers[i];
            numbers[i] = numbers[b - j];
            numbers[b - j] = x;
        }

        j = 0;
        for (int i = c - 1; i < (d - c) / 2 + c; i++) {
            j++;
            int x = numbers[i];
            numbers[i] = numbers[d - j];
            numbers[d - j] = x;
        }

        for (int i = 0; i < n; i++)
            System.out.println(numbers[i] + " ");
    }
}
