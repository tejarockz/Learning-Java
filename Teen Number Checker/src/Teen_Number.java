import java.util.Scanner;

public class Teen_Number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        TeenNumberChecker(n1,n2,n3);
    }
    public static void TeenNumberChecker(int n1, int n2, int n3){
        if((n1>=13 && n1<=19) || (n2>=13 && n2<=19) || (n3>=13 && n3<=19)){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
}
