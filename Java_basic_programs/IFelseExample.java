import java.util.Scanner;

public class IFelseExample {

    public static void main(String [] args ){

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the age :  ");
//        int age  = input.nextInt();
//
//        if(age<18){
//            System.out.println("Not eligible for vote!!");
//        }
//        else {
//            System.out.println("Eligible for vote !!");
//        }

          boolean isSeniorCitizen =  false;
          boolean isAnAdult = false;

          if(isSeniorCitizen){
              System.out.println("I am Senior Citizen !.. ");
          }
          else {
              if(isAnAdult){
                  System.out.println(" I am Adult!..");
              }
              else {
                  System.out.println("I am Child!..");
              }
          }
    }
}
