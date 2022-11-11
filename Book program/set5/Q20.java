//Write a java program to count how many letters and digit are present in the String.
import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();

        int cl=0,dc=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A'&&ch<='Z' ||ch>='a'&&ch<='z')
            cl++;
            else if(ch>='0'&&ch<='9')
            dc++;
        }
        System.out.println("Letters Are: "+cl);
        System.out.println("Digits Are: " +dc);
        sc.close();
    }
    
}
