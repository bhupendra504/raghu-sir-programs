import java.util.Scanner;
public class Palindromenumber {
    static boolean isPalindrome(int n)
    {
        int rev=0,temp=n;
        do{
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        while(n!=0);
          if(rev==temp)
           return true;
           else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        System.out.println(isPalindrome(a));
    }
    
}
