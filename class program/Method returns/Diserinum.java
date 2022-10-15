import java.util.Scanner;
public class Diserinum {
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
    static boolean isDiserium(int n)
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
    static void printDiserium(int n)
    {
        for(int i=1;i<=n;i++)
         if(isDiserium(i))
          System.out.print(i+" ");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        printDiserium(n);

    }
    
}
