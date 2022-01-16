import java.util.Scanner;

public class Variables {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String s = scan.next();
        Variables_method(n,s);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        Max_and_min_int(n1,n2);

        byte b1 = scan.nextByte();
        byte b2 = scan.nextByte();
        Max_and_min_byte(b1,b2);

        short s1 = scan.nextShort();
        short s2 = scan.nextShort();
        Max_and_min_short(s1,s2);

        long l1 = scan.nextLong();
        long l2 = scan.nextLong();
        Max_and_min_long(l1,l2);

        long l =scan.nextLong();
        byte b = scan.nextByte();
        short S = scan.nextShort();
        type_casting(l,b,S);

        int i1 = scan.nextInt();
        byte B = scan.nextByte();
        short S1 = scan.nextShort();
        Challenge(i1,B,S1);

        float f1 = scan.nextFloat();
        float f2 = scan.nextFloat();
        Max_and_min_float(f1,f2);

        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        Max_and_min_double(d1,d2);

        float petrol =scan.nextFloat();
        float diesel = scan.nextFloat();
        float wallet_balance = scan.nextFloat();
        double petrol1 = scan.nextDouble();
        double diesel1 = scan.nextDouble();
        double wallet_balance1 = scan.nextDouble();
        Float_and_double_Challenge(petrol,diesel,wallet_balance,petrol1,diesel1,wallet_balance1);
    }
    public static void Variables_method(int n, String s){
        System.out.println("The integer input is: "+n);
        System.out.println("The string input is: "+s);
    }
    public static  void Max_and_min_int(int n1, int n2){
        n1 = Integer.MAX_VALUE;
        n2 = Integer.MIN_VALUE;
        System.out.println(n1+"\n"+n2);
    }
    public static void Max_and_min_byte(byte b1, byte b2){
        b1 =Byte.MAX_VALUE;
        b2 =Byte.MIN_VALUE;
        System.out.println(b1+"\n"+b2);
    }
    public static void Max_and_min_short(short s1, short s2){
        s1 = Short.MAX_VALUE;
        s2 = Short.MIN_VALUE;
        System.out.println(s1+"\n"+s2);
    }
    public static void Max_and_min_long(long l1, long l2){
        l1 = Long.MAX_VALUE;
        l2 = Long.MIN_VALUE;
        System.out.println(l1+"\n"+l2);
    }
    public static void type_casting(long l, byte b, short s){
        b = (byte)(b/2);
        s = (short)(s/2);
        l = l/2;
        System.out.println(l+"\n"+b+"\n"+s);
    }
    public static void Challenge(int i1, byte b, short s){
        long l1 = 1000*(i1+b+s);
        System.out.println(l1);
    }
    public static void Max_and_min_float(float f1, float f2){
        f1 = Float.MAX_VALUE;
        f2 = Float.MIN_VALUE;
        System.out.println(f1+"\n"+f2);
    }
    public static void Max_and_min_double(double d1,double d2){
        d1 = Double.MAX_VALUE;
        d2 = Double.MIN_VALUE;
        System.out.println(d1+"\n"+d2);
    }
    public static void Float_and_double_Challenge(float petrol,float diesel,float wallet_balance, double petrol1, double diesel1,double wallet_balance1){
        petrol = wallet_balance / petrol;
        diesel = wallet_balance / diesel;
        petrol1 = wallet_balance1/ petrol1;
        diesel1 = wallet_balance1 / diesel1;
        System.out.println("The quantity of petrol in float is: "+petrol);
        System.out.println("The quantity of diesel in float is: "+diesel);
        System.out.println("The quantity of petrol1 in double is: "+petrol1);
        System.out.println("The quantity of diesel1 in double is:"+diesel1);
    }
}
