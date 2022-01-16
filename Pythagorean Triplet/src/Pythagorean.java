import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        int side3 = scan.nextInt();
        PythagorenTriplet(side1,side2,side3);
    }
    public static void PythagorenTriplet(int side1,int side2, int side3){
        int p = side1 * side1;
        int q = side2 * side2;
        int r = side3* side3;
        if((p+q == r) || (p+r == q) || (q+r == p)){
            System.out.println("The given numbers form a pythogorean triplet");
        }
        else{
            System.out.println("Invalid Numbers");
        }
    }
}
