//Write a java program to count how many capital vowel and small consonents are present in the String.
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String ");
    String st=sc.nextLine();
    int lc=0,spc=0;
    for(int i=0;i<st.length();i++)
    {
        char ch=st.charAt(i);
        if(ch>='a'&&ch<='z')
          lc++;
       
           else if(!(ch>='0' &&ch<='9')&&!(ch>='A'&&ch<='Z'))
             spc++;
    }
    System.out.println("number of Small letter "+lc);
    System.out.println("number of special characters "+spc);
    sc.close();
}
    
}
