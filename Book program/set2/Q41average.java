import java.util.Scanner;
public class Q41average {
    static int digitCount(int n)
    {
        int count=0;
        do
        {
            count++;
            n=n/10;
        }
        while(n!=0);
        return count;
    }
    static int digitSum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
    static int averageDigit(int n)
    {
        return digitSum(n)/digitCount(n);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(averageDigit(n));
    }

    }

    

