import java.util.Scanner;
public class Q22palindrome {
    static boolean palindrome(int n)
    {
        int rev=0, temp=n;
        do{
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        while(n!=0);
        return rev==temp;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if(palindrome(n))
        {
         System.out.println("palindrome ");
        }
        else 
        {
            System.out.println("Not palindrome");
        }
        sc.close();
    }
    
}
