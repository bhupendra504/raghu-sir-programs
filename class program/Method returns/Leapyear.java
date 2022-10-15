        import java.util.Scanner;
public class Leapyear {
    static boolean leapYear(int n)
    {
        if(n%4==0)
           if(n%100==0)
            if(n%400==0)
              return true;
              else
              return false;
              else
              return true;
              else
              return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the year");
        int x=sc.nextInt();
        System.out.println(leapYear(x));

        

    }
    
}
