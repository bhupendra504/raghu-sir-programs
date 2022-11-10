//Wap String pangran or not by using inbuilt method.
import java.util.Scanner;
public class Pangramnot {
    public  static boolean isPangram(String st)
    {
        if(st.length()<26)
         return false;
         for(char ch='a';ch<='z';ch++)
         {
            if(st.indexOf(ch)==-1)
            return false;
         }
         return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String str=sc.nextLine();
        boolean rs=isPangram(str);
        if(rs)
         System.out.println("String is pangram");
         else 
           System.out.println("String is pangram");
           sc.close();
    }
    
}
