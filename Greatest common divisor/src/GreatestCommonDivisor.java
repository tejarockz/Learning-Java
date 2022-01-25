import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int First = scan.nextInt();
        int Second = scan.nextInt();
        System.out.println(GCD(First,Second));
        scan.close();
    }
    public static int GCD(int First, int Second){
        int gcd = 1;
        if(First <10 || Second<10){
            return -1;
        }
        else {
            for(int i = 1;i<=First && i<=Second;i++){
                if((First%i==0) && (Second%i==0)){
                    gcd = i;
                }
            }
            return gcd;
        }
    }
}
