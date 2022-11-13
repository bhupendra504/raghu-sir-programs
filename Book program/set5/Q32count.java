//  Write a java program to define a method to calculate the sum of digit present in the String.
import java.util.Scanner;
public class Q32count {
    public static int sumDigit(String str)
    {
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='0' && ch<='9')
            {
                sum=sum+ch-48;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        System.out.println("Digit sum: "+sumDigit(st));
        sc.close();
    }
    
}
