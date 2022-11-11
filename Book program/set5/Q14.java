//Writre a java program to count how many capital letters and special characters are present in the String.
import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();

        int uc=0,sl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A' && ch<='Z')
            uc++;
            else if(!(ch>='0'&&ch<='9')&&!(ch>='a' && ch<='z'))
            sl++;
        }
        System.out.println("Capital letters: "+uc);
        System.out.println("Special Characters Are: "+sl);
        sc.close();

    }
    
}
