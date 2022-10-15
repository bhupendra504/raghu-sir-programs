
class Decimaltooctal {
    static String decimaltoOctal(int dec)
    {
        String oct="";
        do
        {
            int rem=dec%8;
            oct=rem+oct;
            dec =dec/8;
        }
        while(dec!=0);
        return oct;
    }
    public static void main(String args[])
    {
        System.out.println("decimal to octal "+decimaltoOctal(98));
    }
    
}
