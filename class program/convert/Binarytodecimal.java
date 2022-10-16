class Binarytodecimal {
    static int binTodec(int bin) {
        int pw = 1;
        int dec = 0;
        do {
            int r = bin % 10;
            dec = dec + r * pw;
            pw = pw * 2;
            bin = bin / 10;
        } while (bin != 0);
        return dec;
    }

    static int octTodec(int oct) {
        int dec = 0, pw = 1;
        do {
            int r = oct % 10;
            dec = dec + r * pw;
            pw = pw * 8;
            oct = oct / 10;
        } while (oct != 0);
        return dec;
    }

    static int hexaTodec(String hx) {
        int pw = 1, dec = 0;
        for (int i = hx.length() - 1; i >= 0; i--) {
            char ch = hx.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                dec = dec + (ch - 55) * pw;
            else if (ch >= 'a' && ch <= 'z')
                dec = dec + (ch - 87) * pw;
            else if (ch >= '0' && ch <= '9')
                dec = dec + (ch - 48) * pw;
            pw = pw * 16;
        }
        return dec;
    }

    public static void main(String args[]) {
        System.out.println("binary to decimal " + binTodec(10111));
        System.out.println("octa to decimal " + octTodec(253));
        System.out.println("hexa to decimal " + hexaTodec("5C"));
    }

}