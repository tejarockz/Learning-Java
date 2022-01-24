import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int year = scan.nextInt();
        NumberOfDaysInAMonth(month,year);
        scan.close();
    }
    public static boolean isLeap(int year){
        if((year % 100!=0 && year%4==0) || (year%400==0)){
            return true;
        }
        else {
            return false;
        }
    }
    public static void NumberOfDaysInAMonth(int month, int year){
        switch (month){
            case 1:
                System.out.println("January "+year+" has 31 days");
                break;
            case 2:
                String x = isLeap(year) ? "February "+year+" has 28 days" : "February "+year+" has 29 days";
                System.out.println(x);
                break;
            case 3:
                System.out.println("March "+year+" has 31 days");
                break;
            case 4:
                System.out.println("April "+year+" has 30 days");
                break;
            case 5:
                System.out.println("May "+year+" has 31 days");
                break;
            case 6:
                System.out.println("June "+year+" has 30 days");
                break;
            case 7:
                System.out.println("July "+year+" has 31 days");
                break;
            case 8:
                System.out.println("August "+year+" has 31 days");
                break;
            case 9:
                System.out.println("September "+year+" has 30 days");
                break;
            case 10:
                System.out.println("October "+year+" has 31 days");
                break;
            case 11:
                System.out.println("November "+year+" has 30 days");
                break;
            case 12:
                System.out.println("December "+year+" has 31 days");
                break;
            default:
                System.out.println("Please select a valid year and month");
                break;
        }
    }
}
