//Write a java program to count how many small vowels and Capital consonent are present in the String.
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();

        int sl=0,cl=0; 
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
                sl++;
            }   
            else if(ch>='A' &&ch<='Z')
            {
              
                if(ch!='A'&&ch!='I' &&ch!='O' &&ch!='U' &&ch!='E')
                cl++;
            
                
            }
        }
        System.out.println("Small vowels Are: "+sl);
        System.out.println("Capital Consonents Are:"+cl);
        sc.close();
    }
    
}
