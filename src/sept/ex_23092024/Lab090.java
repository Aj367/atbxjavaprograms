package sept.ex_23092024;

public class Lab090 {
    public static void main(String[] args) {
        char c = 'C';
        switch (c) {
            case 'A' + 1:
                System.out.println("Ba");
                break;
            case 'A':
                System.out.println("Ab");  //A
                break;
            case 'A' + 2:                  // A+2=A,B,C A+B+C, so its printing cell, if its A+3 then it prints 64 out of condition
                System.out.println("Cell");
                break;
        }
        System.out.println(64);
    }
}
