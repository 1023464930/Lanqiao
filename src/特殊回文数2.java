import java.util.Scanner;

public class 特殊回文数2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int sum = 0;
        if(n%2==0){
            //偶数
            int flag=0;
            boolean m=false;
            for(int i=1;i<=9;i++){
                //i是首位
                if((n/2-i)<=18){
                    if(!m){flag=i;m=true;}
                    if(flag!=1) {
                        for (int a = flag;(a<=9)&&(a<=n/2-i);a++){
                            if((n/2-i-a)<5){
                                int b=i*10001+a*1010+(n/2-i-a)*200;
                                System.out.println(b);
                                sum++;
                            }
                        }
                    }
                    else{
                        for(int a=0;(a<=9)&&(a<=n/2-i);a++){
                            if((n/2-i-a)<5){
                                int b=i*10001+a*1010+(n/2-i-a)*200;
                                System.out.println(b);
                                sum++;
                            }
                        }
                    }
                }
                else{
                }
            }
            flag=0;
            m=false;
            for(int i=1;i<=9;i++){
                //i是首位
                if((n/2-i)<=18){
                    if(!m){flag=i;m=true;}
                    if(flag!=1) {
                        for (int a = flag;(a<=9)&&(a<=n/2-i);a++){
                            if((n/2-i-a)<=9){
                                int b=i*100001+a*10010+(n/2-i-a)*1100;
                                System.out.println(b);
                                sum++;
                            }
                        }
                    }
                    else{
                        for(int a=0;(a<=9)&&(a<=n/2-i);a++){
                            if((n/2-i-a)<=9){
                                int b=i*100001+a*10010+(n/2-i-a)*1100;
                                System.out.println(b);
                                sum++;
                            }
                        }
                    }
                }
                else{
                }
            }

        }
        else{
            int flag=0;
            boolean m=false;
            //奇数
            for(int i=1;i<=9;i++){
                //i是首位
                if((n/2-i)<=18){
                    if(!m){flag=i;m=true;}
                    if(flag!=1) {
                        for (int a = flag;(a<=9)&&(a<=n/2-i);a++){
                            if((n/2-i-a)<5){
                                int b=i*10001+a*1010+(n/2-i-a)*200+100;
                                System.out.println(b);
                                sum++;
                            }
                        }
                    }
                    else{
                        for(int a=0;(a<=9)&&(a<=n/2-i);a++){
                            if((n/2-i-a)<5){
                                int b=i*10001+a*1010+(n/2-i-a)*200+100;
                                System.out.println(b);
                                sum++;
                            }
                        }
                    }
                }
                else{
                }
            }
        }
        System.out.println(sum);
    }
}