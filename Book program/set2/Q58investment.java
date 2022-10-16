import java.util.Scanner;
public class Q58investment {
    static double power(double n,int p)
    {
        double pw=1;
        while(p>0)
        {
         pw=pw*n;
         p--;
        }
        return pw;
    }
    static double futureInvestment(int pv,int i,int n)
    {
        double p=i/100.0;
        double fv=pv*power((1+p),n);
        return fv; 
    }

   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the present value");
        int pv=sc.nextInt();
        System.out.println("Enter the investment");;
        int i=sc.nextInt();
        System.out.println("Enter the period investment year");
        int n=sc.nextInt();
        System.out.println(futureInvestment(pv,i,n));
 
}
}
