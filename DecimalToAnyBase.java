import java.util.Scanner;

public class DecimalToAnyBase {

    private static int convert(int num,int db){
        
        int sum=0;
        int p=1;
        while(num>0)
        {
            int rem= num%db;
            num=num/db;

            sum+=rem*p;
            p*=10;

        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int num=ip.nextInt();
        int db =ip.nextInt();

        int ans =convert(num,db);
        System.out.println(ans);

        ip.close(); 
    }
}
