import java.util.Scanner;

public class PlayingCat_Class {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean summer = scan.nextBoolean();
        int temperature = scan.nextInt();
        isCatPlaying(summer,temperature);
        scan.close();
    }
    public static void isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        else {
            if(temperature>=25 && temperature<=35){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
    }
}
