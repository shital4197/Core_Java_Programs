import java.util.Scanner;

public class PalindromeExample {  // Fixed spelling: Palidrome -> Palindrome

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        boolean isPalindrome = isPalindrome(num);  // Fixed spelling

        if (isPalindrome) {
            System.out.println("Number is palindrome!");
        } else {
            System.out.println("Number is not palindrome!");
        }
    }

    private static boolean isPalindrome(int num) {  // Fixed spelling
        int reversedNum = reverse(num);  // Call the reverse function
        return num == reversedNum;       // Compare original number and reversed number
    }

    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
