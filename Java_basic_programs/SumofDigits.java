import java.util.Scanner;

public class SumofDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the sum of digits number !");
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int sum  = addsum(num);
        System.out.println("sum of digits is : "+ sum);
    }

    public static int addsum(int num){
        int sum = 0;
        while (num>0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
