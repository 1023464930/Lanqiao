import java.math.BigInteger;
import java.util.Scanner;

class Test1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int input =scanner.nextInt();
        System.out.println(Fibonacci(input));
    }
    public static BigInteger Fibonacci(int n)
    {
        BigInteger sum=new BigInteger("0");
        BigInteger n1 = new BigInteger("1");
        BigInteger n2 = new BigInteger("1");
        if(n==1||n==2)
        {
            return new BigInteger("1");
        }
        else
        {
            for(int i=0;i<n-2;i++)
            {
                sum=n1.add(n2);
                n1=n2;
                n2=sum;
                System.out.println(sum);
            }
            return sum.remainder(new BigInteger("10007"));
        }
    }
}
