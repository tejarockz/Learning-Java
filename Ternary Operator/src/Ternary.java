import java.util.Scanner;

public class Ternary {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Ternary_Operator(n);
        int length = scan.nextInt();
        int breadth = scan.nextInt();
        Area_of_rectangle(length,breadth);
        Perimeter_of_rectangle(length,breadth);
    }
    public static void Ternary_Operator(int n){
        String x = (n>=5)?(n>5?"Correct":"Not ok"):(n>3?"Ok":"Invalid");
        System.out.println(x);
    }
    public static void Area_of_rectangle(int length, int breadth){
        int Area = length * breadth;
        System.out.println("Area of a rectangle is: "+Area);
    }
    public static void Perimeter_of_rectangle(int length, int breadth){
        double perimeter = 2*(length + breadth);
        System.out.println("Perimeter os a rectangle is: "+perimeter);
    }
}
