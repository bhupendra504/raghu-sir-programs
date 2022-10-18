import java.util.Scanner;
public class Q55four {
    static Double percentageOverall(int a,int b,int c,int d)
    {
        int total=a+b+c+d;
        return (double) total/4.00;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  four subject number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(percentageOverall(a,b,c,d)+"%");
        sc.close();
    }
    
}
