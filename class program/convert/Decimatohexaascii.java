public class Decimatohexaascii {
    static String decimaltoHexa(int dec)
    {
        String hx="";
        do
        {
            int rem=dec%16;
            if(rem<10)
             hx=rem+hx;
             else 
              hx=(char)(rem+55)+hx;
              dec=dec/16; 
        }
        while(dec!=0);
         return hx;
    }
    public static void main(String args[])
    {
        System.out.println("Decimal to Hexadecimal  "+decimaltoHexa(92));
    }
    
}
