//Write a java program to count hoe many capital letters and small letters in the String.
import java.util.Scanner;
public class Q2capitalsmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();

        int uc=0,lc=0;
        for(int i=0;i<st.length();i++)
        {
        
            char ch=st.charAt(i);
            if(ch>='A' && ch<='Z')
            uc++;
            else if(ch>='a'  && ch<='z')
            lc++;
        }
        System.out.println("Number Of Capital Letter: "+uc);
        System.out.println("Number Of Small Letter: "+lc);
        sc.close();
    }
    
}
