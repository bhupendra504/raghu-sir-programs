//wap to count howmany vowel and consnonts present inthe String.
import java.util.Scanner;
public class Howmanyvowel {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();
        int vc=0,cc=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A'  && ch<='Z')
            {
                if(ch=='A' || ch=='E' || ch=='O' ||ch=='I' ||ch=='U')
                vc++;
                else 
                cc++;
            }
            else if(ch>='a' && ch<='z')
            if(ch=='a' || ch=='e' || ch=='o' ||ch=='i' ||ch=='u')
            vc++;
            else 
            cc++;
        }
        System.out.println("Number of vowel: "+vc);
        System.out.println("Number of consononts: "+cc);
        sc.close();
    }
    
}
