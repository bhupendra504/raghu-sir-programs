import java.util.Scanner;
public class Q42setteddigit {
    static int settedDigit(int n)
    {
        int count=0;
        do{
            count=count+n%2;
            n=n/2;
        }
        while(n!=0);
          return count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(settedDigit(n));
    }
    
}
