import java.util.Scanner;

public class Q17month {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month number:");
        int a=sc.nextInt();

        if(a==1 || a==3 ||a==5 ||a==7 ||a==8 ||a==10 ||a==12 )
          System.out.println("31days");
          else if(a==4||a==6||a==9||a==11)
            System.out.println("30 Days");
            else if(a==2)
             System.out.println("28 or 29 days");
             else 
               System.out.println("Invaild month number:");`    
             
    }
    
}
