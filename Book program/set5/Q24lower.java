
//Write a java program to convert all the characters into lowercase.Using inbuilt method
import java.util.Scanner;
public class Q24lower {
    public static String convertToLower(String str) {
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z')
                ch[i] = (char) (ch[i] + 32);
        }
        str = new String(ch);
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        System.out.println(convertToLower(st));
        sc.close();
    }

}

/* 
public class Q24lower{
    public static String convertToLower(String str)
    {
        String string="";
        for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);
          if(ch>='A'&&ch<='Z')
          {
            string =string+(char)(ch+32);
          }
          else 
          {
            string =string +ch;
          }
        }
        return string;
    }
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String st = sc.nextLine();

    st = convertToLower(st);
    System.out.println(st);
    sc.close();
    }
}
*/