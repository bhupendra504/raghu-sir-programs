class Decimaltohexa {
    static String decimaltoHexa(int dec) {
        String hx = "";
        do {
            int rem = dec % 16;

            if (rem < 10)
                hx = rem + hx;
            else if (rem == 10)
                hx = 'A' + hx;
            else if (rem == 11)
                hx = 'B' + hx;
            else if (rem == 12)
                hx = 'C' + hx;
            else if (rem == 13)
                hx = 'D' + hx;
            else if (rem == 14)
                hx = 'E' + hx;
            else if (rem == 15)
                hx = 'F' + hx;

            dec=dec/16;
        } while (dec != 0);
        return hx;
    }

    public static void main(String args[]) {
        System.out.println("Decimal to Hexadecimal " +decimaltoHexa(92));
    }

}
