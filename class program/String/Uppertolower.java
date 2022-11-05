/*Wap to upper to lower case */
import java.util.Scanner;
public class Uppertolower {
    static String toLower(String str)
    {
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='A' && ch[i]<='Z')
             ch[i]=(char)(ch[i]+32);
        }
        str=new String (ch);
        return str;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.next();

        st=toLower(st);
        System.out.print(st);
        sc.close();
    }
    
}
