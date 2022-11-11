//Write a java program to count how many capital vewels and capital consonenents are present in the String.
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        int vc=0,cl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
                if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
                vc++;
                else
                cl++;
        
            }
        }
        System.out.println("Capital vowels Are: "+vc);
        System.out.println("Capital Consonents Are: "+cl);
        sc.close();
        
    }
    
}
