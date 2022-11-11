//Write a java program to count how many capital vowel and small consonents are present in the String.
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();

        int vc=0,sl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A' &&ch<='Z')
            {
                if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
                vc++;
            }
            else if(ch>='a' &&ch<='z')
            {
                if(ch!='a' && ch!='e' &&ch!='i' &&ch!='u' &&ch!='o')
                sl++;
            }
        }
        System.out.println("Capital Vowel: "+vc);
        System.out.println("Small Consonents Are: "+sl);
        sc.close();
        
    }
    
}
