import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int num =ip.nextInt();
        int d =ip.nextInt();

        int ans = freq(num, d);
        System.out.println(ans);
        ip.close();
    }

    private static int freq(int num,int d){
        
        int count=0;
        while(num!=0){
            int rev=num%10;
            if(rev==d){
                count++;
            }
            num=num/10;
        }

        return count;
    }
}
