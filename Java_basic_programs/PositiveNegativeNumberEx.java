import java.util.Scanner;

public class PositiveNegativeNumberEx {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        double number = input.nextDouble();

        if(number<0){
            System.out.println("The given number negative!...");
        }
        else if (number>0){
            System.out.println("The give number is positive!..");
        }
        else if (number==0){
            System.out.println("The given number is 0!..");

        }
    }
}







































