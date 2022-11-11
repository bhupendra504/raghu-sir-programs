//Write a java program to count how many small vewels ,smallconsonents and special Characters are present in the String.
import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        int vs=0,cs=0,sl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                 vs++;
                 else
                 cs++;
            }
            else if(!(ch>='0'&&ch<='9')&&!(ch>='A'&&ch<='Z'))
            {
                sl++;
            }
        }
        System.out.println("Small vowels: "+vs);
        System.out.println("Small consonents are: "+cs);
        System.out.println("Special Characters Are: "+sl);
        sc.close();
    }
    
}
