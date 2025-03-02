import java.util.Scanner;

public class AdditionScannerEx {

    public static void main(String [ ] arges){

        Scanner input = new Scanner(System.in);
        System.out.println("Addition of two numbers !!");

        System.out.println("Enter your frist number : ");
        int num1 = input.nextInt();

        System.out.println("Enter your second number : ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Addition of two number is :" + sum);
    }
}
