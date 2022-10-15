import java.util.Scanner;
public class Product {
    static int productNumber(int n)
    {
        int product=1;
        while(n>0)
        {
            int rem=n%10;
             product=product*rem;
             n=n/10;
        }
        return product;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=sc.nextInt();
        System.out.println(productNumber(x));
    }

}
