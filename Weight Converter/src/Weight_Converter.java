import java.util.Scanner;

public class Weight_Converter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double kgs = scan.nextDouble();
        WeightConverter(kgs);
    }
    public static void WeightConverter(double kgs){
        double grams = kgs * 1000;
        double milligrams = grams * 1000;
        System.out.println("Weight in grams is: "+grams);
        System.out.println("Weight in milligrams is: "+milligrams);
    }
}
