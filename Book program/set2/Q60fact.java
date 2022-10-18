import java.util.Scanner;
public class Q60fact {
    static int factNum(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    static int ncr(int n,int r)
    {
        return factNum(n)/(factNum(n-r)*factNum(r));
    }
    static int  npr (int n,int r)
    {
        return factNum(n)/factNum(n-r);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println("NCR"+ncr(n,r));
        System.out.println("NPR "+npr(n,r));
        sc.close();
    }

    
}
