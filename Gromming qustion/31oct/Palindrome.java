public class Palindrome
 {
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
        int count=0;
       for(int i=1;i<=500;i++)
       if(palindrome(i))
       {
        count++;
       }
       System.out.println(count);
    }
    
}

