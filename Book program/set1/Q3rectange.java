import java.util.Scanner;
public class Q3rectange {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int l=sc.nextInt();
        System.out.println("Enter the heigth: ");
        int h=sc.nextInt();
        int rectange=l*h;
        int perimeter=2*(l+h);
        System.out.println("area of rectange "+rectange);
        System.out.println("perimetr of rectangle "+perimeter);

    }
    
}
