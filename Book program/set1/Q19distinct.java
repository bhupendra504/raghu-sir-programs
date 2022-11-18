import java.util.Scanner;
public class Q19distinct {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the thied number");
        int c=sc.nextInt();

        if(a==b ||a==c||b==c)
           System.out.println("please enter distinct number");
           else if(a>b&&a>c)
             if(b>c)
              System.out.println(b);
              else 
               System.out.println(c);
               else if(b>a&&b>c)
                if(a>c)
                 System.out.println(a);
                 else 
                  System.out.println(c);
                  else if(c>a&&c>b)
                  if(a>b)
                   System.out.println(a);
                    else 
                      System.out.println(b);
                      sc.close();
                 
            
    }
    
}
