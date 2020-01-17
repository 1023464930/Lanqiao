import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        final double Pi=Math.PI;
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        System.out.printf("%.7f",r*r*Pi);
    }
}
