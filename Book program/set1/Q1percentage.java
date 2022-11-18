import java.util.Scanner;
public class Q1percentage {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the name: ");
    String name=sc.nextLine();
    System.out.println("Enter the number ");
    long mobile=sc.nextLong();
    System.out.println("Enter the 10 percentage: ");
    double percentage=sc.nextDouble();
    System.out.println("Enter the 12 percentage: ");
    double toper=sc.nextDouble();
    System.out.println("Enter the degree: ");
    double degree=sc.nextDouble();
    System.out.println("name "+name);
    System.out.println("number "+mobile);
    System.out.println("10percentage "+percentage);
    System.out.println("12 percentage "+toper);
    System.out.println("Degree "+degree);
    sc.close();
    
    }
}
