import java.util.Scanner;

public class SumOfOddNumber {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sum od add number Example !");
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        int sum = addSum(num);
        System.out.println("Odd till " + num + " is " + num);
    }

    public static int addSum(int num) {
        int sum = 0;
        int i = 1;

        // Loop to add odd numbers only
        while (i <= num) {
            sum += i; // Add the odd number
            i += 2;   // Go to the next odd number
        }

        return sum; // Return the result
    }

    }
    
