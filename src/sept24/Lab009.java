//To print small calculator, which supports (+,-,*,/,%)
package sept24;

public class Lab009 {
    public static void main (String[] args)
    {
        double a = 34;
        double b = 10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.printf( "Addition of two numbers is %.1f + %.1f = %.1f",a,b, a+b);
        System.out.println();
        System.out.printf( "Subtraction of two numbers is %.1f - %.1f = %.1f",a,b, a-b);
        System.out.println();
        System.out.printf( "Multiplication of two numbers is %.1f * %.1f = %.1f",a,b, a*b);
        System.out.println();
        System.out.printf( "Division of two numbers is %.1f / %.1f = %.1f",a,b, a/b);
        System.out.println();
        System.out.printf( "Modulus of two numbers is %.1f %.1f = %.1f",a,b, a%b);

    }
}
