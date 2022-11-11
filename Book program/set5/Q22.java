//Write a java program to count how many capital latters,specialcharacters and gigit are present in the String.
import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();

        int uc=0,sl=0,dc=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A'&&ch<='Z')
            uc++;
            else if(!(ch>='0'&&ch<='9'))
            sl++;
            else if(ch>='0'&&ch<='9')
            dc++;
        }
        System.out.println("Capital Letters: "+uc);
        System.out.println("Special Characters Are: "+sl);
        System.out.println("Digits Are: " +dc);
        sc.close();
    }

}
