import java.util.Scanner;

public class AnyBaseToAnyBase {

    private static int anyToDeci(int num,int db){
        int sum=0;
        int p=1;
        while(num>0){
            int rem =num%10;
            num=num/10;

            sum+=rem*p;
            p*=db;
        }
        return sum;
    }

    private static int deciToAny(int num,int db){
        int sum=0;
        int p=1;
        while(num>0){
            int rem =num%db;
            num=num/db;

            sum+=rem*p;
            p*=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        
        int num=ip.nextInt();
        int sb=ip.nextInt();
        int db =ip.nextInt();
        

        int ans =anyToDeci(num,sb);
        int res =deciToAny(ans, db);
        System.out.println(res);

        ip.close(); 
    }
}
