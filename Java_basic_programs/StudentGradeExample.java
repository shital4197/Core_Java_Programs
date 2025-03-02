import java.util.Scanner;

public class StudentGradeExample {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int marks = input.nextInt();

        if(marks<=100 && marks>=90){
            System.out.println("The student grade is 'A' ");
        }
        else if(marks<=90 && marks>=75){
            System.out.println("The student grade is 'B' ");
        }
        else if (marks<=75 && marks>=60){
            System.out.println("The student grade is 'C' ");
        }
        else if (marks<60 && marks>=30){
            System.out.println("The student grade is 'D' ");
        }
        else if (marks<30){
            System.out.println("The student is Fail!!");
        }
    }
}
