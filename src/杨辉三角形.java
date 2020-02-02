import java.util.Scanner;

public class 杨辉三角形
{
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        int[][] yanghui = new int[num][num];
        for(int i=0;i<num;i++)
        {
            yanghui[i][0]=1;
            yanghui[i][i]=1;
        }
        for(int i=2;i<num;i++)
        {
            for(int j=1;j<num-1;j++)
            {
                yanghui[i][j]=yanghui[i-1][j]+yanghui[i-1][j-1];
            }
        }
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print(yanghui[i][j]+" ");
            }
            if(i!=num-1)
            {System.out.println();}
        }
    }
}
