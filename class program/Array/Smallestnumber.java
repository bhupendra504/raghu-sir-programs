import java.util.Scanner;
public class Smallestnumber {
    static double getSmallest(double[] arr) {
        double small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small)
                small = arr[i];
        }
        return small;
    }

    static double[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();

        double[] ar = new double[n];
        System.out.println("Enter the" + n + "double value");
        for (int i=0; i < ar.length; i++) {
            ar[i] = sc.nextDouble();
        }
        return ar;
    }

    static void displayArray(double[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        double[] x = readArray();
       double sl = getSmallest(x);
        System.out.println("Smallest is: " + sl);
        
    
    }

}
