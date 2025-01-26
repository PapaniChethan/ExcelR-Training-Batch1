import java.util.Scanner;
public class Demo044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num2: ");
        int num2 = sc.nextInt();
        System.out.println("Num1 before swapping: "+num1);
        System.out.println("Num2 before swapping: "+num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Num1 after swapping: "+num1);
        System.out.println("Num2 after swapping: "+num2);

    }
    
}
