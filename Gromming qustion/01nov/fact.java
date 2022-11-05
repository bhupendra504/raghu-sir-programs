import java.util.Scanner;
public class fact {
    static int printFact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else 
        {
            return(n*printFact(n-1));
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        sc.close();
        System.out.println(printFact(n));
      
    }
    
}
