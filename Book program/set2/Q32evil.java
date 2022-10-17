import java.util.Scanner;

public class Q32evil {
    static String dectoBin(int dec) {
        String bin = "";
        do {
            int rem = dec % 2;
            bin = rem + bin;
            dec = dec / 2;
        } while (dec != 0);
        return bin;
    }

    static boolean evilOdius(int num) {
        String bin = dectoBin(num);
        int count = 0;

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1')
                count++;

        }
      
        if (count % 2 == 0)
            return true;
        else
            return false;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (evilOdius(a)) {
            System.out.println("Evil number");
        } else {
            System.out.println("Odius number");
        }
    }

}
