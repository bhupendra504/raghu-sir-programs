import java.util.Scanner;
public class Q28automorphic {
    static int digitCount(int n) {
        int count = 0;
        do {
            count++;
            n = n / 10;
        } while (n != 0);
        return count;
    }

    static int power(int n, int p) {
        int pw = 1;
        while (p > 0) {
            pw = pw * n;
            p--;
        }
        return pw;
    }

    static boolean automorPhic(int n) {
        int dc = digitCount(n);
        int sq = n * n;

        int ld = sq % power(10, dc);
        if (ld == n)
            return true;
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (automorPhic(n))
            System.out.println("Automorphic number");
        else
            System.out.println("not Automorphic");
            sc.close();
    }
   

}
