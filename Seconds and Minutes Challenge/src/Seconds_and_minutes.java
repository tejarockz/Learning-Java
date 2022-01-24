import java.util.Scanner;

public class Seconds_and_minutes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int Minutes = scan.nextInt();
        int Seconds = scan.nextInt();
        String method_1 = getDurationString(Minutes,Seconds);
        String method_2 = getDurationString(Seconds);
        System.out.println(method_1);
        System.out.println(method_2);
    }
    public static String getDurationString(int Minutes, int Seconds){
        if(Minutes<0 || Seconds<0 || Seconds >59){
            return "Invalid";
        }
        int Hours = Minutes / 60;
        int RemainingMinutes = Minutes % 60;
        return Hours+"h"+RemainingMinutes+"m"+Seconds+"s";
    }
    public static String getDurationString(int Seconds){
        if(Seconds<0){
            return "Invalid";
        }
        int minutes = Seconds / 60;
        int remainingSeconds = Seconds % 60;
        return getDurationString(minutes,remainingSeconds);
    }
}
