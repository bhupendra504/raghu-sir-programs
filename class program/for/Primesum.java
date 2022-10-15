import java.util.Scanner;
public class Primesum {
    static boolean isPrime(int x)
    {
        for(int i=2;i<=x/2;i++)
        {
            if(x%i==0)
              return false;
        }
        return true;
    }
    static int sumofPrime(int n)
    {
        int sum=0;
        for(int i=2;i<=n;i++)
        {
            boolean rs=isPrime(i);
            if(rs)
             sum=sum+i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n=sc.nextInt();
        int s= sumofPrime(n);
        System.out.println("sum of prime number with in "+n+ " is "+s);
    }
    
}
