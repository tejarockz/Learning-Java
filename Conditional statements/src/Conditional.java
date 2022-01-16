import java.util.Scanner;

public class Conditional {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int marks = scan.nextInt();
        Conditional_statements(marks);
    }
    public static void Conditional_statements(int marks){
        if(marks >=90){
            System.out.println("A grade");
        }
        else if(marks>=80){
            System.out.println("B grade");
        }
        else if(marks>=70){
            System.out.println("C grade");
        }
        else if(marks>=60){
            System.out.println("D grade");
        }
        else if(marks>=50){
            System.out.println("E grade");
        }
        else{
            System.out.println("Fail");
        }
    }
}
