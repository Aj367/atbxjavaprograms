//Declare and assign value for integer,byte,octal,hex
package sept.ex_13092024;

public class Lab023 {
    public static void main(String[] args) {
        //Literals
        boolean is_married = true;
        System.out.println(is_married);
        boolean is_married_amit = false;
        System.out.println(is_married_amit);
        // First Type - Boolean  values - true or false.

        // Literal - integer type - Decimal system.
        int age = 78;
        System.out.println(age);

        // Binary Literal
        int binary_num  = 0b1010; //->
        System.out.println(binary_num);

        // Octal base? 8
        int octal = 0101; // 0101 = (0 × 8³) + (1 × 8²) + (0 × 8¹) + (1 × 8⁰) = 65
        System.out.println(octal);

        // Hexadecimal Literals
        int hex = 0Xface; //base 16 color comination are in hex - #28a745
        System.out.println(hex);
    }
}
