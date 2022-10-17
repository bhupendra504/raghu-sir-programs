import java.util.Scanner;
public class Q4leap {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        if(a%4==0)
         if(a%100==0)
          if(a%400==0)
            System.out.println("leap year");
            else 
             System.out.println("not leap year");
             else 
             System.out.println("leap year");
             else 
              System.out.println("not leap year");
    }
    
}
