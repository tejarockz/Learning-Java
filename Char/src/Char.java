import java.util.Scanner;

public class Char {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        Char_method(c);
        scan.nextLine();
        String s = scan.next();
        String_method(s);
    }
    public static void Char_method(char c){
        char c1 = '\u0190';
        System.out.println("The special utf character is: "+c1);
        System.out.println("The entered character is: "+c);
    }
    public static void String_method(String s){
        System.out.println("The entered string is: "+s);
    }
}
