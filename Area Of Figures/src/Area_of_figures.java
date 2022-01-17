import java.util.Scanner;

public class Area_of_figures {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int breadth = scan.nextInt();
        double height = scan.nextDouble();
        Area(length);
        Area(length,breadth);
        Area(breadth,height);
    }
    public static void Area(int length){
        double sq_area = length * length;
        System.out.println("Area of a square is: "+sq_area);
    }
    public static void Area(int length, int breadth){
        double rect_area = length * breadth;
        System.out.println("Area of a rectangle is: "+rect_area);
    }
    public static void Area(int breadth, double height){
        double tri_area = 0.5*(breadth * height);
        System.out.println("Area of a triangle is: "+tri_area);
    }
}
