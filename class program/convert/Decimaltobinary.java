
public class Decimaltobinary {
    static String dectoBinary(int dec)
    {
        String bin="";
        do{
            int rem=dec%2;
            bin=bin+rem;
            dec=dec/2;
        }
        while(dec!=0);
        return bin;

    }
    public static void main(String args[])
    {
        System.out.println("decimal to binary "+dectoBinary(75));
    }
    
}
