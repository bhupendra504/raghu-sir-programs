import java.util.Scanner;
public class Sumdigit {
    static int sumDigit(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int r=n%10;
            sum=sum+r;
            n=n/10;
            
        }
        return sum;
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numebr");
    int x=sc.nextInt();
    int s=sumDigit(x);
    System.out.println("Sum of Digit "+s);
    }
    
}
