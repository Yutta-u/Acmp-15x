import java.util.Scanner;

public class Kletki {
    public static Scanner scan = new Scanner(System.in);
    public static String str;
    public static int x;

    public static void main(String[] args) {
        str = scan.nextLine();

        if (str.equals("A1") || str.equals("A3") || str.equals("A5") || str.equals("A7")
        || str.equals("C1") || str.equals("C3") || str.equals("C5") || str.equals("C7")
        || str.equals("G1") || str.equals("G3") || str.equals("G5") || str.equals("G7")
        || str.equals("E1") || str.equals("E3") || str.equals("E5") || str.equals("E7")
        || str.equals("B2") || str.equals("B4") || str.equals("B6") || str.equals("B8")
        || str.equals("D2") || str.equals("D4") || str.equals("D6") || str.equals("D8")
        || str.equals("F2") || str.equals("F4") || str.equals("F6") || str.equals("F8")
        || str.equals("H2") || str.equals("H4") || str.equals("H6") || str.equals("H8"))
            System.out.println("BLACK");
        else
            System.out.println("WHITE");
    }
}
