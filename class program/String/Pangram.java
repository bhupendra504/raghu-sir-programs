/*String pangram or not. */
import java.util.Scanner;
public class Pangram {
    static boolean isPangram(String st)
    {
        if(st.length()<26)
        {
            return false;
        }
        int count[]=new int[26];
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                count[ch-65]++;
            }
            else if(ch>='a' && ch<='z')
            {
                count[ch-97]++;
            }
        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i]==0)
            {
                return false;
            }
           
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();

        boolean rs=isPangram(st);
        if(rs==true)
         System.out.println("String is a Pangram");
         else 
          System.out.println("String is not a Pangram");
          sc.close();
    }
    
}
