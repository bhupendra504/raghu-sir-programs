/*wap to convert all the character in the given string to lowercase without using inbuit mwthod predefined method. */
import java.util.Scanner;
public class Convertcharacter {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();

        char ch[]=st.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            System.out.println(i+"------> "+ch[i]);
        }
        sc.close();
    }
    
}
