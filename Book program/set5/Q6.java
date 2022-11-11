//Write a java program to count how many capital overls and small overls are present in the String.
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();

        int vc=0,vl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
            vc++;
            
            else if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' )
            vl++;
            
        }
        System.out.println("Capital Vowel Are: "+vc);
        System.out.println("Small Vowel Are: "+vl);
        sc.close();
    }
    
}
