// Write a java program to check whether given string is Anagram or not.
import java.util.Scanner;
public class Q40anagram {
    static int[] countFreq(String str)
    {
        int count[]=new int[26];
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='A' &&ch<='Z')
            {
                count[ch-65]++;
            }
            else if(ch>'a' &&ch<='z')
            {
                count[ch-97]++;
            }
        }
        return count;
    }
  public static boolean isAnagram(String st1,String st2)
    {
        int []ch1=countFreq(st1);
        int []ch2=countFreq(st2);
        for(int i=0;i<26;i++)
        {
            if(ch1[i]!=ch2[i])
            {
                return false;
            }
        }
        return true;
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String");
        String st1=sc.nextLine();
        System.out.println("Enter the second String");
        String st2=sc.nextLine();
        if(isAnagram(st1, st2))
        System.out.println("String is Anagram");
        else 
         System.out.println("String is not Anagram");
         sc.close();
        
    }
    
}
