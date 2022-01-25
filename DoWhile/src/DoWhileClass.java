import java.util.Scanner;

public class DoWhileClass {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        DoWhile(n);
        scan.close();
    }
    public static void DoWhile(int n){
        int sum =0;
        do {
            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        while (n!=0);
        System.out.println(sum);
    }
}
