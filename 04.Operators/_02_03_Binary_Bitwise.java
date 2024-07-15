public class _02_03_Binary_Bitwise {

    public static void main(String[] args) {
        
        //Bitwise operator eg. &,|,~,^,<<,>>

        // System.out.println(Integer.toBinaryString(97));
        // System.out.println(Integer.toBinaryString(57));

        System.out.printf("%08d \n",Integer.parseInt(Integer.toBinaryString(97)));
        System.out.printf("%08d \n",Integer.parseInt(Integer.toBinaryString(57)));

        //      97 -> 01100001
        //      57 -> 00111001
        // 97 & 57 -> 00100001  -> decimal ?
        // 0*2^7+0*2^6+1*2^5+0*2^4+0*2^3+0*2^2+0*2^1+1*2^0
        // 32+1
        // 33
        System.out.println(97&57);

        //      97 -> 01100001
        //      57 -> 00111001
        // 97 | 57 -> 01111001  -> decimal ?
        System.out.println(97|57);
    }
}