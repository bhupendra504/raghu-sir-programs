import java.util.Scanner;
public class Armstrongnumber {
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
    static void printArm(int n)
    {
        for(int i=0;i<=n;i++)
          if(isArmstong(i))
           System.out.print(i+ " ");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        printArm(n);
       
    }
    
}

    


    

