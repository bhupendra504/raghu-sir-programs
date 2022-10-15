import java.util.Scanner;
public class Specialnumber {
    static boolean isSpecial(int n)
    {
        int d1=n%10;
        int d2=n/10;
        int sum=d1*d2+d1+d2;

        if(sum==n)
            return true;
            else
               return false;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Ente the number: ");
        int x=sc.nextInt();

        boolean ns=isSpecial(x);

        if(ns==true)
        {
            System.out.println("number is a Special "+x);
        }
        else
        {
            System.out.println("number is not a spcial number "+x);
        }
    }
    
}
