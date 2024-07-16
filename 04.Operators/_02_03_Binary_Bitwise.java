public class _02_03_Binary_Bitwise {

    public static void main(String[] args) {
        
        //Bitwise operator eg. &,|,~,^,<<,>>

        // System.out.println(Integer.toBinaryString(97));
        // System.out.println(Integer.toBinaryString(57));

        // System.out.printf("%08d \n",Integer.parseInt(Integer.toBinaryString(97)));
        // System.out.printf("%08d \n",Integer.parseInt(Integer.toBinaryString(57)));

        //      97 -> 01100001
        //      57 -> 00111001
        // 97 & 57 -> 00100001  -> decimal ?
        // 0*2^7+0*2^6+1*2^5+0*2^4+0*2^3+0*2^2+0*2^1+1*2^0
        // 32+1
        // 33
        // System.out.println(97&57);

        //      97 -> 01100001
        //      57 -> 00111001
        // 97 | 57 -> 01111001  -> decimal ?
        // System.out.println(97|57);

        // bitwise not (~)
        // System.out.println(~10);
        // System.out.println(~-10);

        //left shift <<
        // 00001010  -> 8 bit 

        // System.out.println(10<<1);// 10 * 2  // 00010100
        // System.out.println(10<<2);// 10 * 2 * 2  // 00101000
        // System.out.println(10<<3);// 10 * 2 * 2 * 2  // 01010000
        // System.out.println(10<<4);// 10 * 2 * 2 * 2 * 2 // 1010000
        // System.out.println(10<<5);// 10 * 2 * 2 * 2 * 2 * 2 // 0100000

        // System.out.println(Integer.toBinaryString(10));

        // 00010100
        //  1*2^4+0*2^3+1*2^2+0*2^1+0*2^0
        //  16 + 4 
        // 20

        //right shift >>
        System.out.println(128>>1);
        System.out.println(128>>2);
        System.out.println(128>>3);
        System.out.println(128>>4);
        System.out.println(128>>5);
    }
}