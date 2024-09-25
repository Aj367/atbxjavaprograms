//Java doesn't allow method overloading for the main method with the same signature,
// so having more than one main(String[] args) method will lead to this error
//You should have only one main(String[] args) method in the class.
// If you want to print all three messages, you can combine them into the same main method.

/*package sept.ex_06092024;
public class Lab005 {
    public static void main(String[] args) {
        System.out.println("Hello World1");
    }

    public static void main(String[] args) {
        System.out.println("Hello world 2");
    }

    public static void main(String[] args) {
        System.out.println("Hello world3");
    }

    public static void main(String[] args) {
        System.out.println("Hello World 4");
    }

    public static void main(String[] args) {
        System.out.println("Hello World 5");
    }
    }
    */
// main method should not be called more than once, method overloading is not allowed in java
package sept.ex_06092024;

public class Lab005 {

    public static void main(String[] args){
        System.out.println("Hello World1");
        System.out.println("Hello World2");
        System.out.println("Hello World3");
        //main("Man");
    }
    /*public static void main(String[] args){
        System.out.println("Hello World2!");
        main( "Sangeeta");
    }*/
    //public static void main(String[] args){
       // System.out.println("Hello World3!");
    }



