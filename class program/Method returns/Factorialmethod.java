import java.util.Scanner;
public class Factorialmethod {
    static int getfact(int n)
    {
        int fact=1;
        while(n>1)
        {
            fact=fact*n;
            n--;
        }
        return fact;
    }
    public static void main(String args[])
    {
        System.out.println("mms");
        int f1=getfact(6);
        System.out.println(f1);

        int f2=getfact(9);
        System.out.println(f2);
        System.out.println("mmf");
    }
    
}
