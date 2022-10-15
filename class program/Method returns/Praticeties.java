import java.util.Scanner;

public class Praticeties {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b || b == c || c == a)
            System.out.println("please enter the distinct number");
        else if (a > b && a > c)
            if (b > c)
                System.out.println(b);
            else
                System.out.println(c);
        else if (b > c && b > a)
            if (a > c)
                System.out.println(a);
            else
                System.out.println(c);
        else if (c > a && c > b)
            if (a > b)
                System.out.println(a);
            else {
                System.out.println(b);
            }

    }
}
