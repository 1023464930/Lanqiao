import java.util.Scanner;

public class 特殊回文数3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
//        int sum=0;
        if(num<=45)//五位数
        {
            for(int i=1;i<=9;i++)
            {
                for(int j=0;j<=9;j++)
                {
                    int k=num-2*(j+i);
                    if(k<=9&&k>=0)
                    {
//                        System.out.println(i+" "+j+" "+k+" "+(2*i+2*j+k==num));
                        System.out.println(i*10001+j*1010+k*100);
//                        sum++;
                    }
                }
            }
        }
        if(num<=54&&num%2==0)//六位数
        {
            for(int i=1;i<=9;i++)
            {
                for(int j=0;j<=9;j++)
                {
                    int k=num/2-i-j;
                    if(k>=0&&k<=9)
                    {
//                        System.out.println(i+" "+j+" "+k+" "+(2*i+2*j+2*k==num));
                        System.out.println(i*100001+j*10010+k*1100);
//                        sum++;
                    }
                }
            }
        }
//        System.out.println(sum);
    }
}
