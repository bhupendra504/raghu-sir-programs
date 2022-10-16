import java.util.Scanner;
public class Q35square {
    static int squareNum(int n)
    {
        int t;
        int sqrt=n/2;
        do{
            t=sqrt;
            sqrt=(t+(n/t))/2;
        }
        while(t-sqrt!=0);
         return sqrt;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(squareNum(n));
        sc.close();
    }
    
}
