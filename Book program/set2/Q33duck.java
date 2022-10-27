import java.util.Scanner;
public class Q33duck {
    static boolean Duck(String n)
    {
        for(int i=1;i<n.length();i++)
        {
            if(n.charAt(i)=='0')
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        String n=sc.nextLine();
        if(Duck(n))
        {
            System.out.println(n+"is a duck number");
        }
        else 
        {
            System.out.println(n+"is a not duck number");
        }
        sc.close();
    }
    
}
