import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =1;i<=n;i++){
            PrimeNumbersRange(i);
        }
        scan.close();
    }
    public static void PrimeNumbersRange(int n){
        int count =0;
        for(int i = 1;i<=n;i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count ==2){
            System.out.println(n+" is a prime number");
        }
    }
}
