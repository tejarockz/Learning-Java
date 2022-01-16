import java.util.Scanner;

public class Equal_Product {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        EqualProductChecker(n1,n2,n3);
    }
    public static void EqualProductChecker(int n1, int n2, int n3){
        if(n1*n2 == n3){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
