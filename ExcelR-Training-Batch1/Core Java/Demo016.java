import java.util.Scanner;
public class Demo016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String reversedstr = new StringBuilder(str).reverse().toString();

        if(str.equals(reversedstr)){
            System.out.println("Entered string is palindrome");
        }else{
            System.out.println("Entered string is not a palindrome");
        }
    }

    
}
