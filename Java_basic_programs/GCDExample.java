import java.util.Scanner;

public class GCDExample {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Greatest Common Divisor Calculator!");

            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();

            int gcd = AddGcd(num1, num2);
            System.out.println("Greatest Common Divisor is: " + gcd);

            sc.close();
        }

        private static int AddGcd(int num1, int num2) {
            int gcd = 1;  // Initialize GCD
            int least = least(num1, num2); // Get the smaller number

            // Check each number from 1 to least
            for (int i = 1; i <= least; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    gcd = i; // Update GCD if i divides both numbers
                }
            }

            return gcd;
        }
        // This method returns the smaller of two numbers
        public static int least(int num1, int num2) {
            if (num1 < num2) {
                return num1;
            } else {
                return num2;
            }
        }
    }

