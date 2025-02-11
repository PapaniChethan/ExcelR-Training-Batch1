import java.util.Scanner;
public class Demo057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int lastDigit = number % 10;
        while (number >= 10) {
            number = number / 10;
        }
        int firstDigit = number;
        int sum = firstDigit + lastDigit;
        System.out.println("The sum of the first and last digits of " + originalNumber + " is: " + sum);

        sc.close();
    }
}
