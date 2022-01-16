import java.util.Scanner;

public class Methods {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String email = scan.nextLine();
        String mobile_no = scan.nextLine();
        int percentage = scan.nextInt();
        student_info(name,email,mobile_no,percentage);
        double distance = scan.nextDouble();
        int time = scan.nextInt();
        double speed = speed_of_train(distance,time);
        System.out.println(speed);
    }
    public static void student_info(String name, String email, String mobile_no, int percentage){
        System.out.println("Student name is: "+name);
        System.out.println("Email of a student is: "+email);
        System.out.println("Mobile_no of a student is: "+mobile_no);
        System.out.println("Percentage of a student is: "+percentage);
    }
    public static double speed_of_train(double distance, int time){
        double speedOfTrain = distance/time;
        return speedOfTrain;
    }
}
