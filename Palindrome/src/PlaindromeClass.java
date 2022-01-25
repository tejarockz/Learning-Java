import java.util.Scanner;

public class PlaindromeClass {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        isPalindrome(number);
        scan.close();
    }
    public static void isPalindrome(int number){
        int temp = number;
        int sum = 0;
        while (number!=0){
            int rem = number%10;
            sum = (sum*10) + rem;
            number = number/10;
        }
        if(sum == temp){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
