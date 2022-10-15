import java.util.Scanner;
public class Alldecimal {
    static String decToBin(int dec)
    {
        String bin="";
        do
        {
            int rem=dec%2;
            bin=rem+bin;
            dec=dec/2;
        }
        while(dec!=0);
        return bin;
    }
    static String decToOct(int dec)
    {
        String oct="";
        do{
            int rem=dec%8;
            oct=rem+oct;
            dec=dec/8;
        }
        while(dec!=0);
        return oct;
    }
    static String decToHex(int dec)
    {
        String hx="";
            do{
                int rem=dec%16;

                if(rem<10) //a-65 b-66 c-67 z98
                    hx=rem+hx;
                else
                    hx = (char) (rem+55)+hx;//  12+55=c+hx
                      
                dec=dec/16;
            }
            while(dec!=0);
            return hx;
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the decimal number");
            int n=sc.nextInt();
            System.out.println("decimal to binary "+decToBin(n));
            System.out.println("Decimal to hex "+decToHex(n));
            System.out.println("Decimal to octal "+decToOct(n));
        }

    }

    

