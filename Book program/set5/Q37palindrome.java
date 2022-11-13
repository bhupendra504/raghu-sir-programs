// Write ajava program to check the user entered string is palindrome or not.
import java.util.Scanner;
public class Q37palindrome {
    public static boolean toPalindrome(String str)
    {
        char ch[]=str.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
             return false;
             i++;
             j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String st=sc.nextLine();
        if(toPalindrome(st))
         System.out.println("String is palindrome");
         else 
         System.out.println("String is not palindrome");
         sc.close();
    }
    
}
