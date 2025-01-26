import java.util.Scanner;
public class Demo039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single character: ");
        char input = sc.next().charAt(0);

        if(Character.isUpperCase(input)){
            System.out.println("Character is in Upper case.");
        }else if(Character.isLowerCase(input)){
            System.out.println("Character is in Lower case.");
        }else if(Character.isDigit(input)){
            System.out.println("Character is a Digit.");
        }else{
            System.out.println("Entered character is neither a letter nor a digit.");
        }
        }
                
    }
    
