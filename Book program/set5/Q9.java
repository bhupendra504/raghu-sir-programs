//Write a java program to count how many small overls and small consonents are present in the String.
import java.util.Scanner;
public class Q9 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        int vc=0,cl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
                vc++;
                else
                cl++;
        
            }
        }
        System.out.println("Small vowels Are: "+vc);
        System.out.println("Small Consonents Are: "+cl);
        sc.close();
    }
    
}
