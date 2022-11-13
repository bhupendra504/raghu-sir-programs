// Write a java program to reverse the String.
import java.util.Scanner;
public class Q36reverse {
    public static String reVerse(String str)
    {
        char ch[]=str.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j)
        {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;

        }
        str=new String(ch);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        System.out.println("Reverse:- "+reVerse(st));
        sc.close();
    }
    
}
