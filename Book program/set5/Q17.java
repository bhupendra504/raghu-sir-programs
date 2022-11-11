//Write a java program to count how many small vowel ,capital consinents and Special Character are present in the String.
import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();

        int vs=0,uc=0,sl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
                vs++;
            }
            else if(ch>='A'&&ch<='Z')
            {
                if(ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')
                uc++;
            }
            else if(!(ch>=0&&ch<=9))
            sl++;
        }
        System.out.println("Small vowels Are: "+vs);
        System.out.println("Capital cansonents  Are: "+uc);
        System.out.println("Special Characters Are: "+sl);
        sc.close();

    }
    
}
