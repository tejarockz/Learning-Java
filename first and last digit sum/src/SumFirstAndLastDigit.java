import java.util.Scanner;

public class SumFirstAndLastDigit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        SumFirstAndLastDigitMethod(number);
        scan.close();
    }
    public static void SumFirstAndLastDigitMethod(int number){
        int last = number%10;
        if(number<0){
            System.out.println("-1");
        }
        else{
            while (number>=10){
                number = number/10;
            }
            int first = number;
            System.out.println(first+last);
        }
    }
}
