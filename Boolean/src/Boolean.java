import java.util.Scanner;

public class Boolean {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean b = scan.nextBoolean();
        Boolean_method(b);
    }
    public static void Boolean_method(boolean b){
        if(b == true | b == false) {
            System.out.println("The entered boolean value is: " + b);
        }
        else{
            System.out.println("The entered value is invalid");
        }
    }
}
