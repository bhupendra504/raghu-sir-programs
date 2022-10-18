import java.util.Scanner;

public class Q34xylem {
    static String checkXp(int n) {
        int os = 0, ms = 0, t = n;
        while (n != 0) {
            int rem = n % 10;
            if (t == n || rem == n)
                os = os + rem;
            else
                ms = ms + rem;
        }
        if (ms == os )
            return "Xylem";
        return "phloem";

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        checkXp(n);
        sc.close();
    }

}
