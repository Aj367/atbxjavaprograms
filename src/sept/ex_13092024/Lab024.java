package sept.ex_13092024;

public class Lab024 {
    public static void main(String[] args) {
        // Integral

        // Char
        //  Single Char
        char c1 = 'A';
        System.out.println(c1);
        char c2 = 'B';
        System.out.println(c2);
        char c3 = '@';
        System.out.println(c3);

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';

        System.out.println("gita"+ new_line +  "c");
        // System.out.println("gita"+ '\n' +  "c");
        System.out.println("gita"+ tab_line +  "c");
        System.out.println("gita"+ back_space +  "c");
        System.out.println("gita"+ car_r +  "c");

        char c11  = '\u1F60'; //65 - ASCII
        System.out.println(c11);
        // chinese - india, japense -> unicode
        // /u09878

        System.out.println(c11); // ὠ - :)
    }
}
