import java.util.Scanner;

public class Table_Class {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Table(n);
        scan.close();
    }
    public static void Table(int n){
        int i = 1;
        while (i<=10){
            System.out.println(n+" * "+i+" = "+(n*i));
            i++;
        }
    }
}
