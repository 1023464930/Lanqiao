import java.util.Scanner;

public class 字符串对比
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1=scanner.next();
        String input2=scanner.next();
        if(input1.length()!=input2.length())
        {
            System.out.print("1");
        }
        else
        {
            if(input1.equals(input2))
            {
                System.out.print("2");
            }
            else if(input1.toUpperCase().equals(input2.toUpperCase()))
            {
                System.out.print("3");
            }
            else
            {
                System.out.print("4");
            }
        }
    }
}
