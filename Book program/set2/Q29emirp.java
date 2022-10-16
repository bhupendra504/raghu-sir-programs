import java.util.Scanner;

public class Q29emirp {
    static int reverseNum(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    static boolean primeNum(int n) {
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    static void emirpNum(int n) {
        if (primeNum(n) == primeNum(reverseNum(n)))
        {
            System.out.println("Emirp number");
        }
        else
        {
        System.out.println("not Emirp number");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        emirpNum(n);

    }

}
