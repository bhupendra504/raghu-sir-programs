import java.util.Scanner;
public class Neon {
    static boolean isNeon(int n)
    {
        int sum=0;
        int sq=n*n;
        do{
            int rem=sq%10;
            sum=sum+rem;
            sq=sq/10;        
        }
        while(sq!=0);
        return sum==n;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(isNeon(n));
    }

    
}
