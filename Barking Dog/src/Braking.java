import java.util.Scanner;

public class Braking {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean barking = scan.nextBoolean();
        int HourOfDay = scan.nextInt();
        boolean result = ShouldWakeUp(barking,HourOfDay);
        System.out.println(result);
    }
    public static boolean ShouldWakeUp(boolean barking, int HourOfDay){
        if(HourOfDay>0 && HourOfDay<=23){
            if(barking && (HourOfDay<8 || HourOfDay>22)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
