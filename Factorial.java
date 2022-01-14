import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int r=ip.nextInt();

        int nfact=facto(n);
        int nmrfact=facto(n-r);

        int npr=nfact/nmrfact;

        System.out.println(npr);

        ip.close();


    }

    private static int facto(int r){
        int fact=1;
        for(int i=1;i<=r;i++)
        {
            fact*=i;
        }
        return fact;
    }


    
}