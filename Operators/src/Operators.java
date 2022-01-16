import java.util.Scanner;

public class Operators {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        Arithmetic_Operators(i1,i2);
        Assignment_Operators(i1,i2);
        Bitwise_Operators(i1,i2);
        boolean b1 = scan.nextBoolean();
        boolean b2 = scan.nextBoolean();
        Logical_Operators(b1,b2);
        Shift_Operators(i1,i2);
        Unary_Operators(i1,i2);
    }
    public static void Arithmetic_Operators(int i1, int i2){
        int Addition = i1+i2;
        int subtraction = i1-i2;
        int multiplication = i1*i2;
        int division = i1/i2;
        int remainder = i1%i2;
        System.out.println("Addition is: "+Addition+" Subtraction is: "+subtraction+" Multiplication is: "+multiplication+" Division is: "+division+" remainder is: "+remainder);
    }
    public static void Assignment_Operators(int i1, int i2){
        System.out.println("Addition "+(i1+= i2));          //Addition
        System.out.println("Subtraction "+(i1-= i2));       //Subtraction
        System.out.println("Multiplication "+(i1*= i2));    //Multiplication
        System.out.println("Division "+(i1/= i2));          //Division
        System.out.println("Remainder "+(i1%= i2));         //Remainder
    }
    public static void Bitwise_Operators(int i1, int i2){
        System.out.println("Bitwise And "+(i1 & i2));
        System.out.println("Bitwise Or "+(i1 | i2));
        System.out.println("Bitwise Ex-Or "+(i1 ^ i2));
    }
    public static void Logical_Operators(boolean b1, boolean b2){
        System.out.println("Logical And "+(b1 && b2));
        System.out.println("Logical Or "+(b1 || b2));
        System.out.println("Bitwise And "+(b1 & b2));
        System.out.println("Bitwise Or "+(b1 | b2));
    }
    public static void Shift_Operators(int i1, int i2){
        System.out.println("Left Shift: "+(i1<<i2));
        System.out.println("Right Shift: "+(i1>>i2));
    }
    public static void Unary_Operators(int i1, int i2){
        System.out.println("Postfix: "+((i1++)+(i2++))); // 11
        System.out.println("Prefix: "+((++i1)+(++i2)));  // 13
        System.out.println("Prefix and Postfix: "+((++i1)+(i2++))); //12
        System.out.println("Prefix and Postfix: "+((i1++)+(++i2))); //12
    }
}
