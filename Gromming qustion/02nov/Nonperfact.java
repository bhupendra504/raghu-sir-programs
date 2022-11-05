import java.util.Scanner;
public class Nonperfact {
    static boolean isPerfact(int n)
    {
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum==n;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting range");
        int start=sc.nextInt();
        System.out.println("Enter the end range");
        int end=sc.nextInt();
        sc.close();
        for(int i=start;i<=end;i++)
        {
            if(isPerfact(i)==false)
            {
                System.out.println(i+" ");
            }
        }
    }

    
}
