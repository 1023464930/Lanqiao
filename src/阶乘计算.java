import java.math.BigInteger;
import java.util.Scanner;

public class 阶乘计算
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        BigInteger sum = new BigInteger("1");
        for(int i=1;i<=num;i++)
        {
            sum=sum.multiply(new BigInteger(Integer.toString(i)));
        }
        System.out.print(sum);
    }
}
