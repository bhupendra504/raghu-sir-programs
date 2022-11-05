import java.util.Scanner;
public class Palindrome {
    static boolean isPalindrome(String st)
    {
        int i=0,j=st.length()-1;
        while(i<j)
        {
            if(st.charAt(i)!=st.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        boolean rs=isPalindrome(st);
        if(rs==true)
          System.out.println(st+"is Palindrome");
          else 
           System.out.println(st+"is not a Palindrome");
           sc.close();
    }
    
}
