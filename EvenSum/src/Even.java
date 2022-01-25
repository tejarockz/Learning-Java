import java.util.Scanner;

public class Even {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int Start = scan.nextInt();
        int End = scan.nextInt();
        SumEven(Start,End);
        scan.close();
    }
    public static boolean isEven(int Number){
        if(Number>0){
            return true;
        }
        else if(Number%2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void SumEven(int Start, int End){
        int sum =0;
        if(End>=Start && (Start>0 && End>0)){
            for(int i = Start;i<=End;i++){
                if(isEven(i)){
                    sum+= i;
                }
            }
            System.out.println(sum);
        }
        else{
            System.out.println("-1");
        }
    }
}
