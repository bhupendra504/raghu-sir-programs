import java.util.Scanner;

public class Q56primerange {
    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        
        }
        return true;
    }

    static int sumOfdigit(int a, int b) {
        int sum = 0;
        {
            for (int i = a; i <= b; i++)
            if(isPrime(i))
                sum = sum + i;

        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumOfdigit(a,b));
        sc.close();
    }

}
