import java.util.Scanner;
public class Q36gcd {
    static int gcd(int a,int b)
    {
        int temp;

        if(a<b)
        {
            temp=a;
        }
        else 
        {
            temp=b;
        }
        for(;temp>0;temp--)
        {
            if(a%temp==0 && b%temp==0)
            {
                break;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.println("\ngcd is: "+gcd(a, b));
    }
}
