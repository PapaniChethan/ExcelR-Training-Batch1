import java.util.Scanner;
public class Demo041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Letter: ");
        char input = sc.next().charAt(0);

        switch (input) {
            case 'a':
                System.out.println(input+ " is a Vowel");
                break;
            case 'e':
            System.out.println(input+ " is a Vowel");
            break;
            case 'i':
            System.out.println(input+ " is a Vowel");
            break;
            case 'o':
            System.out.println(input+ " is a Vowel");
            break;
            case 'u':
            System.out.println(input+ " is a Vowel");
            break;
        
            default:
            System.out.println(input+ " is a Consonent");
                break;
        }
    }
    
}
