import java.util.Scanner;
public class Diserinumnumber {
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
        int pow=1;
        while(p>0)
        {
          pow=pow*n;
          p--;
        }
        return pow;
    }
    static boolean isDiserinum(int n)
    {
        int sum=0,t=n;
        int dc=countDigit(n);
        do{
            int r=n%10;
            sum=sum+pow(r,dc);
            dc--;
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
        boolean rs=isDiserinum(x);
        if(rs==true)
         System.out.println(rs);
         else 
          System.out.println(rs);
    }
    
}
