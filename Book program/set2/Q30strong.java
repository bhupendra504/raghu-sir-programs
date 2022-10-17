import java.util.Scanner;
public class Q30strong {
    static int getFact(int n)
    {
        int prod=1;
        while(n>1)
        {
            prod=prod*n;
            n--;
        }
        return prod;
    }
    static boolean strongNumber(int n)
    {
        int sum=0,t=n;
        do{
            int rem=n%10;
            sum=sum+(getFact(rem));
            n=n/10;
        }
        while(n!=0);
        return sum==t;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        if(strongNumber(n))
        {
            System.out.println("Strong number");
        }
        else 
        {
            System.out.println("Not Strong number");
        }
        sc.close();
    }
   

    
}
