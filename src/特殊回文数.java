import java.util.Scanner;

public class 特殊回文数
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum=0;
        for(int i=10000;i<=99999;i++)
        {
            int n1=i/10000;
            int n2=(i%10000)/1000;
            int n3=(i%1000)/100;
            int n4=(i%100)/10;
            int n5=i%10;
            if(n1==n5&&n2==n4&&(n1+n2+n3+n4+n5)==num)
            {
                System.out.println(i);
                sum++;
            }
        }
        for(int i=100000;i<999999;i++)
        {
            int n1=i/100000;
            int n2=(i%100000)/10000;
            int n3=(i%10000)/1000;
            int n4=(i%1000)/100;
            int n5=(i%100)/10;
            int n6=i%10;
            if(n1==n6&&n2==n5&&n3==n4&&(n1+n2+n3+n4+n5+n6)==num)
            {
                System.out.println(i);
                sum++;
            }
        }
        System.out.println(sum);
    }
}
