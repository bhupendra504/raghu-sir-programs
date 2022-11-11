//Write a java program to count how many small overls present in the String.
import java.util.Scanner;
public class Q5smallVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();
        int vl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
            vl++;
        }
        System.out.println("Small oerls are present: "+vl);
        sc.close();
    }
    
}
