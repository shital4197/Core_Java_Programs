package Com.basicjava;

import java.util.Scanner;

public class OddSum {
	
	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		System.out.println("Welcome to SumOdd number !");
		System.out.println("Enter the number : ");
		int num = input.nextInt();
		int sum = oddSum(num);    // call the method 
		System.out.println("OddSum till " + num + " is " + sum);
	}

	private static int oddSum(int num) {
		int sum  = 0;    // intialize for  store odd number
		int i = 1;    // initialize for starting the 1 
		while(i<=num) {   // condition 
			sum += i;    //  add current value of (odd number) in sum
			i+= 2;   // incrases i by to move to the odd number 
		}
		return sum;
	}

}
