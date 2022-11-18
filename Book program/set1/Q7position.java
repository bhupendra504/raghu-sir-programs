import java.util.Scanner;
public class Q7position {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int a=sc.nextInt();

        if(a>0)
          System.out.println("positive "+a);
          if(a<0)
            System.out.println("negative "+a);
             if(a==0)
              System.out.println("zero "+a);
              sc.close();
    }
    
}
