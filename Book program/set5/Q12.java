//Write a java program to count how many letters and special characters are present in the String.
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();
        int uc=0,spc=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A'  && ch<='Z'||ch>='a'&&ch<='z')
              uc++;
           
               else if(!(ch>='0' &&ch<='9'))
                 spc++;
        }
        System.out.println("number of  letter "+uc);
        System.out.println("number of special characters "+spc);
        sc.close();
}
}
