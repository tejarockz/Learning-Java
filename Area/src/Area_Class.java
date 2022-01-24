import java.util.Scanner;

public class Area_Class {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        Area(radius);
        Area(x,y);
        scan.close();
    }
    public static void Area(double radius){
        if(radius<0){
            System.out.println("-1");
        }
        else{
            double area_of_circle = Math.PI* radius * radius;
            System.out.println("Area of the circle is: "+ area_of_circle);
        }
    }
    public static void Area(double x, double y){
        if(x<0 || y<0){
            System.out.println("-1");
        }
        else{
            double area_of_rectangle = x * y;
            System.out.println("Area of a rectangle is: "+area_of_rectangle);
        }
    }
}
