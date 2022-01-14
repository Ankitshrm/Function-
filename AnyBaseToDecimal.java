import java.util.Scanner;

public class AnyBaseToDecimal {


    private static int convert(int num,int db)
    {
        int sum=0;
        int p=1;
        while(num>0)
        {
            int rem=num%10;
            num=num/10;

            sum+=rem*p;
        
            p=p*db;

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
