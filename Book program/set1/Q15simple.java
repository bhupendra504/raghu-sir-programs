import java.util.Scanner;
public class Q15simple {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount=sc.nextInt();
        System.out.println("Enter the rate:");
        int rate=sc.nextInt();
        System.out.println("Enter the time");
        int time=sc.nextInt();
        double special=amount*rate*time/100;
        System.out.println("Special interest"+special);
    }
    
}
