import java.util.Scanner;
public class Demo046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        while(true){
            if(((year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0))){
                System.out.println(year +" is a Leap year.");

            }else{
                System.out.println(year+" is not a leap year.");
            }
            break;
        }

    }
}
