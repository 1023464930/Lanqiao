import java.util.Scanner;

public class 时间转换
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int H = time/3600;
        int M = (time%3600)/60;
        int S = time%60;
        System.out.printf("%d:%d:%d",H,M,S);
    }
}
