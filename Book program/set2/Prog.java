import java.util.Scanner;
public class Prog {
    static int octtoDec(int oct)
    {
       int dec=0,pw=1;
       do{
        int r=oct%10;
        dec=dec+r*pw;
        pw=pw*8;
        oct=oct/10;
       }
       while(oct!=0);
       return dec;
     
        
    }
    public static void main(String[] args) {
        System.out.println(octtoDec(253));
    }
    }

   