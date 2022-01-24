import java.util.Scanner;

public class EqualityPrinter_Class {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        EqualityPrinter(x,y,z);
        scan.close();
    }
    public static void EqualityPrinter(int x, int y, int z){
        if(x<0 || y<0 || z<0){
            System.out.println("Invalid text");
        }
        else if(x == y && y == z){
            System.out.println("All are equal");
        }
        else if(x!=y && y!=z && z!=x){
            System.out.println("All are different");
        }
        else{
            System.out.println("Either all are equal or different");
        }
    }
}
