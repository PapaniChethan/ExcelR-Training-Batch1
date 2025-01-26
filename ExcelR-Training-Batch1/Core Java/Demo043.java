import java.util.Scanner;
public class Demo043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a uppercase character: ");
        char input = sc.next().charAt(0);

        if(Character.isUpperCase(input)){
            char Lowerchar = Character.toLowerCase(input);
            System.out.println("Lowercase: "+Lowerchar);
        }else{
            System.out.println("Enter only Uppercase character.");
        }
    }
    
}
