import java.util.Scanner;
public class Q24armstring {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        int arm=0,c;
        c=n;
        while(n>0)
        {
            int rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm)
        {
            System.out.println("Armstrong number");
        }
        else 
        {
            System.out.println("Not Armstrong number");
        }
        sc.close();
    }
    
}
