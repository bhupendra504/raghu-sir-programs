//Write a java program to count how many capital ovels present in the String.
import java.util.Scanner;
public class Q4overls {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();

        int vc=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch=='A' ||ch=='E' ||ch=='O' ||ch=='I' ||ch=='U')
             vc++;
        }
        System.out.println("Capital Overls are Present: "+vc);
        sc.close();
        
    }
    
}
