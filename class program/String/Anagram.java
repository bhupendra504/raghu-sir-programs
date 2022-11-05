/*wap to print two String are anagram or not */
import java.util.Scanner;
public class Anagram{
    static int[] countFreg(String st)
    {
        int count[]=new int[26];
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
                count[ch-65]++;
            }
            else if(ch>='a'&&ch<='z')
            {
                count[ch-97]++;
            }
        }
        return count;
    }
    static boolean isAnagram(String st1,String st2)
    {
        int ct1[]=countFreg(st1);
        int ct2[]=countFreg(st2);
        for(int i=0;i<26;i++)
        {
            if(ct1[i]!=ct2[i])
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
        String st1=sc.nextLine();
        System.out.println("Enter the String");
        String st2=sc.nextLine();
        

        boolean rs=isAnagram(st1, st2);
        if(rs==true)
         System.out.println("String is a Anagram");
         else 
          System.out.println("String is not a Aangram");
          sc.close();
    }
    
}
