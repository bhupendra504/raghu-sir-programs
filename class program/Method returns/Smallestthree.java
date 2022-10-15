import java.util.Scanner;
public class Smallestthree {
    static int getSmallest(int x,int y,int z)
    {
        if(x<y&&x<z)
          return x;
          else if(y<z)
             return y;
             else 
               return z;
    }
    public static void main(String args [])
    { 
        int small=getSmallest(15,87,56);
        System.out.println("Smallest number "+small);
    }
}
    

