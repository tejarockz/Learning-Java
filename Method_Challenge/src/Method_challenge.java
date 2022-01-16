import java.util.Scanner;

public class Method_challenge {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int marks = scan.nextInt();
        Student_name(name,marks);
    }
    public static char Grade(int marks){
        if(marks>90 && marks<=100){
            return 'A';
        }
        else if(marks>80 && marks<=90){
            return 'B';
        }
        else if(marks>70 && marks<=80){
            return 'C';
        }
        else if(marks>60 && marks<=70){
            return 'D';
        }
        else if(marks>50 && marks<=60){
            return 'E';
        }
        else{
            return 'F';
        }
    }
    public static void Student_name(String name, int marks){
        char c = Grade(marks);
        System.out.println("Student Name is: "+name+" and the grade aquired is: "+c);
    }
}
