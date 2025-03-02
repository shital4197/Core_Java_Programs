import java.util.Scanner;

public class SwapThreeNumberEx {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Swapping of three numbers! ...");

        System.out.println("Enter the 1st number : ");
        int a  = input.nextInt();

        System.out.println("Enter the 2nd value : ");
        int b  = input.nextInt();

        System.out.println("Enter the 3rd value : ");
        int c = input.nextInt();

        int c1 = b;
        int a1 = c;
        int b1 = a;

        System.out.println("Value of A : " + c1);
        System.out.println("Value of B : " + b1);
        System.out.println("Value of C : " + a1);
    }
}
