//How many count in the word present in the sentance.
import java.util.Scanner;
/* 
public class Countword {
    private static int countWord(String st)
    {
        char ch[]=st.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++)
        {
            if(i==0&&ch[i]!=' ' ||ch[i]!=' ' &&ch[i-1]==0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentance");
        String st=sc.nextLine();
        int wc=countWord(st);
        System.out.println("Number of Word: "+wc);
        sc.close();
   
    }
}
*/

public class Countword
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str=sc.nextLine();

        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
            {
                if(ch[i]>='a' && ch[i]<='z')
                {
                    ch[i]=(char)(ch[i]-32);
                }
            }
            else 
            {
                if(ch[i]>='A' && ch[i]<='Z')
                {
                    ch[i]=(char)(ch[i]+32);
                }
            }
        }
        str=new String (ch);
        System.out.println(str);
        sc.close();
    }
}
    

