import java.util.Scanner;

public class KiloByte_Converter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int KiloBytes = scan.nextInt();
        KiloByteConverter(KiloBytes);
    }
    public static void KiloByteConverter(int kilobytes){
        int megaByte = kilobytes /1024;
        int Bytes = kilobytes % 1024;
        System.out.println("Converted data in MegaBytes is: "+megaByte+" MB");
        System.out.println("Remaining data in Bytes is: "+Bytes+" B");
    }
}
