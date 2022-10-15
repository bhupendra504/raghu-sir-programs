import java.util.Scanner;
public class Student {
    static String passFail(int a,int b,int c,int d)
    {
        if(a<35 || b<35 || c<35 ||d<35)
        {
            return "fail";
        }
        else
        {
            return "pass";
        }
            
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number ");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int d=sc.nextInt();
       System.out.println(passFail(a,b,c,d));
    }
    
}
