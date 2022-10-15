import java.util.Scanner;
public class Primecheck {
    static boolean isPrime(int x)
    {
        for(int i=2;i<=x/2;i++)
        {
            if(x%i==0)
             return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        boolean rs=isPrime(n);
        if(rs==true)
         System.out.println("prime");
         else 
         {
            System.out.println("Not prime");
         }
    }

    
}
