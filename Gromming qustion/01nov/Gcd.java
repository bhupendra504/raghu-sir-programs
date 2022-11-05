import java.util.Scanner;
class Gcd
{
    static int gcd(int a,int b)
    {
        int t;
        if(a<b)
        t=a;
        else 
        t=b;
        while(t>=1)
        {
            if(a%t==0&&b%t==0)
            break;
            t--;
        }
        return t;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.println("\nGcd is: "+gcd(a,b));
    }
}