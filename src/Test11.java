import java.util.Scanner;

class Test11
{
    public static void main(String[] args)
    {
        int[] ans = new int[1000000];
        ans[1]=ans[2]=1;
        int n,i;
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        for(i=3;i <= n;i++)
            ans[i] = (ans[i-1]+ ans[i-2])%10007;
        System.out.printf("%d",ans[n]);
    }
}
