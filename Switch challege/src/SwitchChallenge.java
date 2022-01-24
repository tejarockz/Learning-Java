import java.util.Scanner;

public class SwitchChallenge {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char Character = scan.next().charAt(0);
        VowelOrNot(Character);
    }
    public static void VowelOrNot(char character){
        switch(Character.toLowerCase(character)){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not an Vowel");
                break;
        }
    }
}
