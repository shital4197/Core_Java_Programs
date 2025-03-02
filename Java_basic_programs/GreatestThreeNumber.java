import java.sql.SQLOutput;
import java.util.Scanner;

public class GreatestThreeNumber {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");

        System.out.println("Enter the first number : ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = input.nextInt();

        System.out.println("Enter the third number : ");
        int num3 = input.nextInt();

        if(num1>= num2 && num1>=num3){
            System.out.println(num1 +"  " + num2+"  " + num3+ " in this number " + num1 + " is "+ "greatest number!!");
        } else if (num2<=num1 && num2>=num3) {
            System.out.println(num1 +"  " + num2+"  " + num3+ " in this number " + num2 + " is "+ "greatest number!!");
        }
        else if (num3>num1 && num3>num2){
            System.out.println(num1 +"  " + num2+"  " + num3+" in this number " + num3 + " is "+ "greatest number!!");
        }

    }
}
