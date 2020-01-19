import java.util.Scanner;

public class 数列排序
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] set =new int[num];
        for(int i=0;i<num;i++)
        {
            set[i]=scanner.nextInt();
        }
        for(int i=0;i<num-1;i++)
        {
            for(int j=0;j<num-i-1;j++)
            {
                if(set[j]>set[j+1])
                {
                    int tmp=set[j];
                    set[j]=set[j+1];
                    set[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<num;i++)
        {
            System.out.print(set[i]+" ");
        }
    }
}
