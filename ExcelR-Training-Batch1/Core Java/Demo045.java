import java.util.Scanner;
public class Demo045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Before swapping num1: "+num1);
        System.out.println("Before swapping num2: "+num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping num1: "+num1);
        System.out.println("After swapping num2: "+num2);

        sc.close();
    }
    
}
