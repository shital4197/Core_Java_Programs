import java.util.Scanner;

public class SwapTwoNumberEx {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println(" Swapping the to numbers !");

        System.out.println(" Enter the value of A :  ");
        int a  = input.nextInt();

        System.out.println(" Enter the value of B : ");
        int b = input.nextInt();

        int c = a;
        int a1 = b;
        int b1 = c;

        System.out.println("Value of A is : " + a1  );
        System.out.println("Value of B is : " + b1 );
    }
}
