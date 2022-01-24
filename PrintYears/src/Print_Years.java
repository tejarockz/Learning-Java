import java.util.Scanner;

public class Print_Years {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long Minutes = scan.nextLong();
        PrintYearsAndDays(Minutes);
        scan.close();
    }
    public static void PrintYearsAndDays(long Minutes){
        if(Minutes<0){
            System.out.println("Invalid value");
        }
        else{
            long years = Minutes / 525600;
            long MinutesRemaining = Minutes - (years * 525600);
            long daysRemaining = MinutesRemaining /1440;
            System.out.println(years+"y "+daysRemaining+"d");
        }
    }
}
