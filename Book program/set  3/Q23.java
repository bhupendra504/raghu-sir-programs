/*
                12345
                67891
                23456
                78912
                34567
 */

import java.util.Scanner;

public class Q23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                System.out.print(count);
            
            if (j <= n) {
                count++;
            }
            if (count == 10) {
                count = 1;
            }
        }
        System.out.println();
        }
       
        sc.close();

    }

}
