import java.util.Scanner;

public class Shared_Digit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        boolean result = SharedDigit(n1,n2);
        System.out.println(result);
        scan.close();
    }
    public static boolean SharedDigit(int n1, int n2){
        if((n1 >= 10 && n1<=99) && (n2>=10 && n2<=99)){
            if((n1%10 | n1/10) == (n2/10 | n2%10)){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
