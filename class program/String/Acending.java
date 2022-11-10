//Wap to acending order.
import java.util.Arrays;
import java.util.Scanner;
public class Acending {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String str=sc.nextLine();
        str=str.toLowerCase();
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        str=new String(ch);
        System.out.println(str);
        sc.close();
    }
    
}
