import java.sql.SQLOutput;
import java.util.Scanner;

public class OddEvenNumber {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number : ");
        double number = input.nextDouble();

        if(number%2 == 0){
            System.out.println("Given number is even!...");
        }
        else {
            System.out.println("The given number is odd");
        }
    }
}
