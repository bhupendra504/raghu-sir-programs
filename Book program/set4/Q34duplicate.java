
//write a java program to remove the dupalicate element present in the array.
import java.util.Scanner;

public class Q34duplicate {
    private static final Scanner sc = new Scanner(System.in);

    // To print the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // To read the array
    public static int[] readArray() {
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static int[] deleteAtIndex(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Error: Index out of range.");
            return array;
        }

        int[] newArray = new int[array.length - 1];

        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else {
                newArray[i] = array[i + 1];
            }
        }

        return newArray;
    }

    public static int[] removeDuplicates(int[] array) {
        int[] newArray = array;

        for (int i = 0; i < newArray.length; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i] == newArray[j]) {
                    newArray = deleteAtIndex(newArray, j);
                }
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] array = readArray();
        printArray(removeDuplicates(array));
    }
}
