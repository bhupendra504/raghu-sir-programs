import java.util.Scanner;
public class Sanju {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();

        if(a%3==0&&a%5==0)
          System.out.println("geeta weds sanju");
          else if(a%3==0)
           System.out.println("geeta");
           else if(a%5==0)
            System.out.println("sanju");
            else 
             System.out.println("brekup");

    }
    
}
