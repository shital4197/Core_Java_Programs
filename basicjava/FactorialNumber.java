package Com.basicjava;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Welcome factorial number !");
        System.out.println("Enter you number : ");
        int num = input.nextInt();
        long fact = factorialnum(num);
        System.out.println("Factorial is : " + fact);
	}

	private static long factorialnum(int num ) {
		if(num<2) {
			return 1;
		}
		
		long fact = 1;   // stores final factorial value
		int i = 2;
		while(i<= num){
			fact*= i;    // multiplay by i at each step 
			i++;
		}
		return fact;
		
	}

}
