import java.util.Scanner;

public class Decimal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        double d3 = scan.nextDouble();
        DecimalComparator(d1,d2,d3);
    }
    public static void DecimalComparator(double d1, double d2, double d3){
        if((Math.round(d1 * 100000)== Math.round(d2 * 100000) ) && (Math.round(d2 * 100000) == Math.round( d3 * 100000))){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
