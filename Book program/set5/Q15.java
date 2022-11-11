//Write a java program to count how many capital letters,small letter and Special Characters are present in the String.
import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();

        int uc=0,lc=0,sl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A'&&ch<='Z')
             uc++;
             else if(ch>='a'&&ch<='z')
             lc++;
             else if(!(ch>='0'&&ch<='9'))
             sl++;
        }
        System.out.println("Capital Letter: "+uc);
        System.out.println("Small Letter Are: "+lc);
        System.out.println("Special Characters Are: "+sl);
        sc.close();
    }
    
}
