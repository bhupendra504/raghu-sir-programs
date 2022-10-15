import java.util.Scanner;

public class Strongnumber {
    static boolean strongNumber(int n) {
        int sum = 0, t = n;
        do {
            int rem = n % 10;
            sum = sum + getFact(rem);
            n = n / 10;
        } while (n != 0);
        return t == sum;
    }

    static int getFact(int x) {
        int prod = 1;
        while (x > 1) {
            prod = prod * x;
            x--;
        }
        return prod;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        boolean rs = strongNumber(a);
        if (rs == true)
            System.out.println(a + " is Strong number");
        else
            System.out.println(a + " is not strong number");
    }

}
