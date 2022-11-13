//  Write a java program to return how many word present in the sentence.
import java.util.Scanner;
public class Q39countword {
    private static int countWord(String str)
    {
        char ch[]=str.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++)
        {
            if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        System.out.println("Count: "+countWord(st));
        sc.close();
    }
    
}
