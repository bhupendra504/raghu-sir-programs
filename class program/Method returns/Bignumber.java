import java.util.Scanner;
public class Bignumber {
    static int getBiggest(int x,int y,int z)
    {
        if(x>y&&x>z)
            return x;
            else if(y>z)
              return y;
              else
                return z;
    }
    public static void main(String args[])
    {

        int big=getBiggest(45,65,78);
        System.out.println("biggest is: "+big);
    }
    
}
