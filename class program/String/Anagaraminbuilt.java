//Wap java to String Anagaram or not bt using inbuilt method.
import java.util.Scanner;
import java.util.Arrays;
public class Anagaraminbuilt {
    static boolean isAnagaram (String st1,String st2)
    {
        st1=st1.replace(" ","");
        st2=st2.replace(" ","");
        if(st1.length()!=st2.length())
         return false;

         st1=st1.toUpperCase();
         st2=st2.toUpperCase();

         char c1[]=st1.toCharArray();
         char c2[]=st2.toCharArray();

         Arrays.sort(c1);
         Arrays.sort(c2);
          
         return Arrays.equals(c1,c2);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String");
        String st1=sc.nextLine();
        System.out.println("ENter the second String");
        String st2=sc.nextLine();

        boolean rs=isAnagaram(st1, st2);
        if(rs)
         System.out.println("String is Anagram");
         else 
          System.out.println("String is not Anagram");
          sc.close();
    }
    
}
