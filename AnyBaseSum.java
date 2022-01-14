import java.util.Scanner;

public class AnyBaseSum {

    private static int SumofBase(int n1,int n2,int b){
        
        int p=1;
        int sum=0;
        int c=0;

        while(n1>0 || n2>0 || c>0){
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n1/10;

            int d=d1+d2+c;
            d = d % b;
            c = d / b;

            sum+=d*p;
            p*=10;


        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int num1=ip.nextInt();
        int num2=ip.nextInt();
        int b=ip.nextInt();

        int sum=SumofBase(num1,num2,b);
        
        System.out.println(sum);

        ip.close();
    }
}
