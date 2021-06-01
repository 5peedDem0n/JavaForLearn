package id.felis.tutorial;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class tipe_data_primitive {
    public static void main(String[] args) {

        // Types of data in Java
        // integer, byte, short, long, double, float, char, boolean

        //INTEGER (satuan)
        int i = 10;
        System.out.println("=====INTEGER=====");
        System.out.println("nilai integer i = " + (i + 1));
        System.out.println("Nilai max = " + Integer.MAX_VALUE);
        System.out.println("Nilai min = " + Integer.MIN_VALUE);
        System.out.println("Besar integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar integer = " + Integer.SIZE + " bit");

        //BYTE (satuan)
        byte b = 10;
        System.out.println("=====BYTE=====");
        System.out.println("nilai byte b = " + b);
        System.out.println("Nilai max = " + Byte.MAX_VALUE);
        System.out.println("Nilai min = " + Byte.MIN_VALUE);
        System.out.println("Besar Byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar Byte = " + Byte.SIZE + " bit");

        //SHORT (satuan)
        short s = 10;
        System.out.println("=====SHORT=====");
        System.out.println("nilai short s = " + s);
        System.out.println("Nilai max = " + Short.MAX_VALUE);
        System.out.println("Nilai min = " + Short.MIN_VALUE);
        System.out.println("Besar Short = " + Short.BYTES + " bytes");
        System.out.println("Besar Long = " + Short.SIZE + " bit");

        //LONG (satuan)
        long l = 10;
        System.out.println("=====LONG=====");
        System.out.println("nilai Long l = " + l);
        System.out.println("Nilai max = " + Long.MAX_VALUE);
        System.out.println("Nilai min = " + Long.MIN_VALUE);
        System.out.println("Besar Long = " + Long.BYTES + " bytes");
        System.out.println("Besar Long = " + Long.SIZE + " bit");

        //DOUBLE (koma, bilangan real)
        double d = -10.5d;
        System.out.println("=====DOUBLE=====");
        System.out.println("nilai Double d = " + d);
        System.out.println("Nilai max = " + Double.MAX_VALUE);
        System.out.println("Nilai min = " + Double.MIN_VALUE);
        System.out.println("Besar Double = " + Double.BYTES + " bytes");
        System.out.println("Besar Double = " + Double.SIZE + " bit");

        //FLOAT (koma, bilangan real)
        float f = -8.5f;
        System.out.println("=====FLOAT=====");
        System.out.println("nilai Float f = " + f);
        System.out.println("Nilai max = " + Float.MAX_VALUE);
        System.out.println("Nilai min = " + Float.MIN_VALUE);
        System.out.println("Besar Float = " + Float.BYTES + " bytes");
        System.out.println("Besar Float = " + Float.SIZE + " bit");

        //CHAR (karakter) berdasarkan ASCII
        char c = 'c';
        System.out.println("=====CHAR=====");
        System.out.println("nilai Char c = " + c);
        System.out.println("Nilai max = " + Character.MAX_VALUE);
        System.out.println("Nilai min = " + Character.MIN_VALUE);
        System.out.println("Besar Char = " + Character.BYTES + " bytes");
        System.out.println("Besar Char = " + Character.SIZE + " bit");

        //BOOLEAN (nilai true atau false)
        boolean val = false;
        System.out.println("=====BOOLEAN=====");
        System.out.println("nilai boolean val = " + val);
        System.out.println("Nilai max = " + Boolean.TRUE);
        System.out.println("Nilai min = " + Boolean.FALSE);
    }
}
