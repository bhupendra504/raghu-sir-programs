/*Print frequency of each character in the given String. */
import java.util.Scanner;
public class Frequency {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();

        int count[]=new int[128];
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            count[ch]++;
        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i]!=0)
            {
                System.out.println((char)i+"------------->"+count[i]);
            }
            sc.close();
        }
    }
    
}
