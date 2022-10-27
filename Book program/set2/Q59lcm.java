import java.util.Scanner;
public class Q59lcm {

    static int lcm(int a,int b)
    {
        int t;
        if(a>b)
         t=a;
         else 
         t=b;
         while (t<=a*b)
         {
            if(t%a==0&&t%b==0)
             break;
             t++;
         }
         return t;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number");
        int a=sc.nextInt();
        int b=sc.nextInt();

        sc.close();

    System.out.println("\nLCM is:" +lcm(a,b));
    }
    
}
