package id.felis.tutorial;

public class operator_bitwise {

    // Operator Bitwise --> operator untuk melakukan operasi pada nilai bit
    /* Dibutuhkan saat mau mengoperasikan dalam level bit
       Kpn kita pake levelnya di bit?
       Jika ingin membuat tipe data boolean yang banyak
     */

    public static void main(String[] args) {

        byte a = 3;
        byte b, c;
        String a_bits, b_bits, c_bits;

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

        // Operator SHIFT LEFT
        System.out.println("====== SHIFT LEFT (<<)");
        b = (byte) (a << 1);// menggeser satu langkah ke kiri
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);

        // Operator SHIFT RIGHT
        System.out.println("====== SHIFT RIGHT (>>)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = (byte) (a >> 2);// menggeser dua langkah ke kananr
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);

        // Operator bitwise OR
        System.out.println("====== BITWISE OR (|)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("----------------- OR");
        c = (byte)(a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);

        // Operator bitwise AND
        System.out.println("====== BITWISE AND (&)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("----------------- AND");
        c = (byte)(a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);

        // Operator bitwise XOR
        System.out.println("====== BITWISE XOR (^)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("----------------- XOR");
        c = (byte)(a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);

        // Operator Negasi / NOT
        System.out.println("====== BITWISE NOT (~)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = (byte) (~a);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d \n", b_bits, b);
    }
}
