import java.util.Scanner;
public class Bintodec {
    static int bintoDec(int bin)
    {
        int dec=0,pw=1;
        do 
        {
          int r=bin%10;
          dec=dec+r*pw;
          pw=pw*2;
          bin=bin/10;
        }
        while(bin!=0);
        return dec;
    }
    public static void main(String[] args) {
        System.out.println(bintoDec(110101));
    }
    
}
