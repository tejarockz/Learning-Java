import java.util.Scanner;

public class String_class {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        String_method(s1,s2);
    }
    public static void String_method(String s1, String s2){
        int i1  = Integer.parseInt(s1);
        int i2 = Integer.valueOf(s2);
        System.out.println(i1+i2);
        System.out.println(s1+s2);
    }
}
