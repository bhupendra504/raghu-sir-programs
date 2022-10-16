import java.util.Scanner;
public class Q54discountrate {
    static int disCountrate(int price,int percentage)
    {
        int discount=price*percentage/100;;
        return price-discount;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price");
        int price=sc.nextInt();
        System.out.println("Enter the percentage");
        int percentage=sc.nextInt();
        System.out.println(disCountrate(price,percentage));
    }
    
}
