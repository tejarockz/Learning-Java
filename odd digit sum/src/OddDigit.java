import java.util.Scanner;

public class OddDigit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        OddDigitSum(number);
        scan.close();
    }
    public static void OddDigitSum(int number){
        if(number<0){
            System.out.println("-1");
        }
        else {
            int sum = 0;
            while (number!=0){
                int rem = number%10;
                if(rem%2 != 0){
                    sum = sum + rem;
                }
                number = number / 10;
            }
            System.out.println(sum);
        }
    }
}
