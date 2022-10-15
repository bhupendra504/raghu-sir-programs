import java.util.Scanner;
public class Q13special {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();

        int b=a%10;
        int c=a/10;
        int sum=(b+c)+(b*c);
        if(sum==a)
        {
            System.out.println("Special number "+a);
        }
        else
        {
            System.out.println("Not special number "+a);
        }
    }
    
}
