import java.util.Scanner;

public class Method_Overloading {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        double height = scan.nextDouble();
        float height1 = scan.nextFloat();
        DisplayDetails(name,age,height);
        System.out.println("Calling Overloaded Method 1");
        DisplayDetails(name,age);
        System.out.println("Calling Overloaded Method 2");
        DisplayDetails(name,age,height1);
        System.out.println("Calling Overloaded Empty Method 3");
        DisplayDetails();
    }
    public static void DisplayDetails(String name, int age, double height){
        System.out.println("Name of the student is: "+name+". Age of the student is: "+age+". Height of the student is: "+height);
    }
    public static void DisplayDetails(String name, int age){
        System.out.println("Name of the student is: "+name+". Age of the student is: "+age);
    }
    public static void DisplayDetails(String name, int age, float height){
        System.out.println("Name of the student is: "+name+". Age of the student is: "+age+". Height of the student is: "+height);
    }
    public static void DisplayDetails(){
        System.out.println("Print Nothing");
    }
}
