import java.util.Scanner;

public class FactorialNumber {
    public static void  main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcom the factorial number: ");
        System.out.println("Enter the number : ");

        int num = sc.nextInt();
        long fact = factNumber(num);

        System.out.println("Factorial is : " + fact);
    }

    public static long factNumber(int num){
        if(num<2){
            return 1;
        }

        long fact = 1;
        int i = 2;

        while (i<=num){
            fact *= i;
            i++;
        }
        return fact;
    }
}
