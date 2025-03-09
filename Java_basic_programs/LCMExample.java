import java.util.Scanner;

public class LCMExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Least common Multiplication");

        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        int lcm = addLcm(num1 , num2);
        System.out.println("Least Common Multiplication of number is : " + lcm);
    }
        public  static  int addLcm(int num1 , int num2){
              int i = 1;
              while(true) {
                  int factor = num1 * i;
                  if (factor % num2 == 0) {
                      return factor;
                  }
                  i++;
              }
        }
}
