import java.util.Scanner;
public class Q1percentage
{

    static double getPercentage(double[] arr) {
        double high = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >high)
                high = arr[i];
        }
        return high;
    }

    static double[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        double[] ar = new double[n];
        System.out.println("enter the "+n+" percentage");
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
       double highest = getPercentage(x);
        System.out.println("Highest percentage: " + highest);
        
    
    }

}

