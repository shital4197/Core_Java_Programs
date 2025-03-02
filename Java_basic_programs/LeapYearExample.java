import java.util.Scanner;

public class LeapYearExample {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year : ");

        int year = input.nextInt();

        if(year%4 == 0){
            System.out.println(year + " "+ " year is a leap year!");
        }
        else{
            System.out.println(year + " " +" year is not a leap year!");
        }
    }
}
