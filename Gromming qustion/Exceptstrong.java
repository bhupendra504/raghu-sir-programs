import java.util.Scanner;
public class Exceptstrong {
    static int digitCount(int n)
    {
        int count=0;
        do
        {
            n=n/10;
            count++;
        }
        while(n!=0);
        return count;
    }
    static int getFact(int n)
    {
        int fact=1;
        while(n>1)
        {
            fact=fact*n;
            n--;
        }
        return fact;
    }
    static boolean isStrong(int n)
    {
        int sum=0,temp=n;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum+getFact(rem);
            n=n/10;
        }
        return sum==temp;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting range");
        int start=sc.nextInt();
        System.out.println("Enter the End range ");
        int end=sc.nextInt();
        sc.close();
        for(int i=start;i<=end;i++)
        {
            if(isStrong(i)==false)
            {
                System.out.println(i+" ");
            }
        }
    }
    
}
