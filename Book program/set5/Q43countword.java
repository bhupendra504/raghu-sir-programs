// Write a java program to count how many characters present in the all the words.
import java.util.Scanner;
import java.util.Arrays;
//using inbuilt method.
/* 
public class Q43countword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();

        String word[]=str.split(" ");
        for(int i=0;i<word.length;i++)
        {
            System.out.println(word[i]+"-->"+word[i].length());
        }
    }  
}
*/
public class Q43countword{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();

        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            String w="";
            while(i<ch.length &&ch[i]!=' ')
            {
                w=w+ch[i];
                i++;
            }
            if(w.length()>0)
            System.out.println(w+"--->"+w.length());
            sc.close();
        }
    }
}
