import java.util.Scanner;
public class Summethod {
    static int sumOfN(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum=sum+n;
            n--;
        }
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println("Main method started");
        int s1=sumOfN(5);
        System.out.println("sum of first 5 natural is: "+s1);

        int x=7;
        int s2=sumOfN(x);
        System.out.println("Sum of first "+x+"natural number is:"+s2);

        System.out.println("sum of frist 8 natural number is:"+sumOfN(8));

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int s3=sc.nextInt();
        System.out.println("sum of first"+n+"natural number is "+s3);
    }
    
}
