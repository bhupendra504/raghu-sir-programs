// Write a java program to convert all the vowel into small remaining capital.
import java.util.Scanner;
public class Q26 {
    public static String vowelToSmall(String str)
    {
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='A' ||ch[i]=='E' ||ch[i]=='I' ||ch[i]=='O' ||ch[i]=='U')
            {
                ch[i]=(char)(ch[i]+32);
            }
            else if((ch[i]>='a' && ch[i]<='z') && !(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u'))
            {
              ch[i]=(char)(ch[i]-32);
            }
        }
        str=new String(ch);
        return str;
    }
        public static void main(String[] args)
         {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String ");
            String st=sc.nextLine();
            st=vowelToSmall(st);
            System.out.println(st);
            sc.close();
        }
    }
    

