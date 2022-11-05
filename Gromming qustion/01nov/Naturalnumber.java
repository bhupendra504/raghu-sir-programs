import java.util.Scanner;
public class Naturalnumber
{
    static void printNumber(int n)
    {
        if(n<=0)
        {
            return ;
        }
        else 
        {
            System.out.println(n+" ");
            printNumber(n-1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        sc.close();
        printNumber(n);
    }
}
    
    

