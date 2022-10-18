import java.util.Scanner;

public class Q21primerange {
    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    static void printprime(int n) {
        for (int i = 2; i <= n; i++)
            if (isPrime(i))
                System.out.print(i + " ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        printprime(n);
        sc.close();
    }
}
