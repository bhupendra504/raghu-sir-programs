//Write a java program to count how many small letters present in the String.
import java.util.Scanner;
public class Q3smallcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();

        int lc=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='a' && ch<='z')
             lc++;
        }
        System.out.println("Small letters are present: "+lc);
        sc.close();
    }
    
}
