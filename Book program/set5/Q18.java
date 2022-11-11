//Write a java program to count how many capital vowel ,capital consonents and special Characters are present in the String.
import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();

        int vc=0,cc=0,sl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                 vc++;
                 else
                 cc++;
            }
            else if(!(ch>='0'&&ch<='9')&&!(ch>='a'&&ch<='z'))
            {
                sl++;
            }
        }
        System.out.println("Capital vowels: "+vc);
        System.out.println("Capital consonents are: "+cc);
        System.out.println("Special Characters Are: "+sl);
        sc.close();

    }
    
}
