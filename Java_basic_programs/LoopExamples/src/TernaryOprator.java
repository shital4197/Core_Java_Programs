import java.util.Scanner;

public class TernaryOprator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter the second value : ");
        int num2 = sc.nextInt();

//        if(num1>num2){
//            System.out.println(num1 + " is greater number");
//        }
//        else {
//            System.out.println(num2 + " is greataer number");
//        }

        // by using the ternary operator
        int greaterNumber = num1>num2 ? num1 : num2;
        System.out.println(greaterNumber+ " " +"is the greater number");

    }
}
