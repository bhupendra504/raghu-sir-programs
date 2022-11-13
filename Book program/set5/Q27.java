// Write a java program to convert all the vowel into capital ewmaining small.
import java.util.Scanner;
public class Q27 {
    public static String vowelToCapital(String str)
    {
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u')
            {
                ch[i]=(char)(ch[i]-32);
            }
            else if((ch[i]>='A' && ch[i]<='Z') &&!(ch[i]=='A' ||ch[i]=='E' ||ch[i]=='I' ||ch[i]=='O' ||ch[i]=='U'))
            {
                ch[i]=(char)(ch[i]+32);
            }

        }
        str=new String(ch);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();

        st=vowelToCapital(st);
        System.out.println(st);
        sc.close();
    }
    
}
