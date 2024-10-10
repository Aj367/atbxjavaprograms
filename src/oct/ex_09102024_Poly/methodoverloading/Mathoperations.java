package oct.ex_09102024_Poly.methodoverloading;

public class Mathoperations {
    // Method Overloading
    int add(int a,int b){
        return a+b;
    }

    String add(String a,String b){
        return a+b;
    }

    void add(int a, int b, int c) {
        System.out.println("Hello");
    }
}
