import java.util.Scanner;

public class ReverseNumberExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int reverse = ReverseNumber(num);
        System.out.println("Reverse yur number is : " + reverse);
    }

    public static int ReverseNumber(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;

    }
}


