import java.util.Scanner;
public class Q7smallest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float d=sc.nextFloat();

        if(a<b&&a<c&&a<d)
        {
            System.out.println("a is smallest "+a);
        }
        else if(b<c&&b<a&&b<d)
        {
          System.out.println("b is smallest "+b);
        }
        else if(c<a&&c<b&&c<d)
        {
            System.out.println("c is smallest "+c);
        }
        else if(d<a&&d<b&&d<c)
        {
            System.out.println("d is smallest "+d);
        }
    }
    
}
