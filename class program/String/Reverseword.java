//Write a program to reverse the  word in the sentence.
import java.util.Scanner;
public class Reverseword {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentance");
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        String rs=" ";

        for(int i=0;i<ch.length;i++)
        {

            int k=i;
            while(i<ch.length&& ch[i]!=' ')
            {
               i++;
            }
            int j=i-1;
            while(j>=k)
            {
                rs=rs+ch[j];
                j--;
            }
            if(i<ch.length)
            rs=rs+ch[i];
        }
        System.out.println(rs);
        sc.close();
    }
    
}
