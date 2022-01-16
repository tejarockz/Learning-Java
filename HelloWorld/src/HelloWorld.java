import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        Hello_World(s);
    }
    public static void Hello_World(String s){
        System.out.println("Hello World!"+ " Welcome to Java, "+s);
    }
}
