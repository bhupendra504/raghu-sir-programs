import java.util.Scanner;
public class Q8 {
    static int oddDigit(int n)
    {
        int count=0;
        while(n!=0)
        {
            int r=n%10;
            if(r%2!=0)
            count++;
            n=n/10;
        }
        return count;
    }
    static int evenDigit(int n)
    {
        int count=0;
        while(n!=0)
        {
            int r=n%10;
            if(r%2==0)
            count++;
            n=n/10;
        }
        return count;
    }
    static void equalDigit(int n)
    {
        if(oddDigit(n)==evenDigit(n))
          System.out.println("good");
          else 
           System.out.println("bad");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        equalDigit(x);
    }
    
}
