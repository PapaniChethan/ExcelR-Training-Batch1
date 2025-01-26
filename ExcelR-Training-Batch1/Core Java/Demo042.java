import java.util.Scanner;
public class Demo042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lowercase character: ");
        char input = sc.next().charAt(0);

        if(Character.isLowerCase(input)){
            char Upperchar = Character.toUpperCase(input);
            System.out.println("Uppercase: "+Upperchar);
        }else{
            System.out.println("Enter only lowercase character.");
        }
    }
    
}
