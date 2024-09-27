package sept.ex_18092024;

public class Lab050 {
    public static void main(String[] args) {
        // Type Casting
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss

        // Widening
        byte b = 10;
        int a = b; // Valid - Implicit Casting - JVM
        int a1 = (int)b; // Valid - Explicit Casting - JVM
        System.out.println(a);
        System.out.println(a1);

        // Narrowing
        int val = 200;
        System.out.println(val);
        //byte b1 = val; // Invalid Implicit Casting - JVM
        byte b2 = (byte)val; // Invalid Explicit Casting - Loss of data.
        System.out.println(b2);
    }
}
