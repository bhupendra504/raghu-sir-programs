import java.util.Scanner;
public class Armstrrong
{
    static int countDigit(int n)
    {
        int count=0;
        do{
            count++;
            n=n/10;
        }
        while(n!=0)
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
    static boolean isArmstrong(int x)
    {
        int dc=countDigits(x);
        int sum=0,temp=x;

        do{
            int r=x%10;
            sum=sum+pw(r,dc);
            x=x/10;
        }
        while(x!=0);
        if(sum==temp)
            return true;

            else
               return false;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        boolean rs=isArmstrong(x);

        if(rs==true)
        {
            System.out.println("Armstrong number "+x);
        }
        else{
            System.out.println("Armstrong not number "+x);
        }
    }
    }
