import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        System.out.println(LastDigitChecker(n1,n2,n3));
        scan.close();
    }
    public static boolean LastDigitChecker(int n1, int n2, int n3){
        if((n1>=10 && n1<=1000) && (n2>=10 && n2<=1000) && (n3>=10 && n3<=1000)){
            if(n1%10 == n2%10 || n1%10 == n3%10 || n2%10 == n3%10){
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