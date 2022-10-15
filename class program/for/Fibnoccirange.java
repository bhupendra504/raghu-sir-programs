import java.util.Scanner;
public class Fibnoccirange {
    static void printFibnocci(int n)
    {
        int f1=0,f2=1;
        while(f1<=n)
        {
            System.out.print(f1+" ");
            int f3=f1+f2;
            f1=f2;
            f2=f3;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n=sc.nextInt();
        printFibnocci(n);
    }
    
}
