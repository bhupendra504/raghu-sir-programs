import java.util.Scanner;
public class Armstringallnumber {
    static int countDigit(int x)
    {
        int count=0;
        do{
            x=x/10;
            count++;
        }
        while(x!=0);
        return count;
    }
    static int pow(int n,int p)
    {
     int pw=1;
     while(p>0)
     {
        pw=pw*n;
        p--;
     }
     return pw;
    }
    static boolean isArmstong(int n)
    {
        int sum=0,t=n;
        int dc=countDigit(n);
        do{
            int rem=n%10;
            sum=sum+pow(rem,dc);
            n=n/10;
        }
        while(n!=0);
         return t==sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        boolean rs=isArmstong(x);
        if(rs==true)
           System.out.println("Armstrong number "+x);
           else 
            System.out.println("not Armstrong number "+x);
    }
    
}
