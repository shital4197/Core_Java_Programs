package Com.basicjava;

import java.util.Scanner;

public class MultiplicationExample {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to multiplication world!");
		System.out.println("Enter your number : ");
		int num = input.nextInt();
		printMultiplication(num);
		
	}

	private static void printMultiplication(int num) {    // creating the method 
//	   int i = 1;   // intialization 
//	   
//	   while(i<=10) // condition
//		{ 
//		   System.out.println(num + " * "+ i + " = " + num *i);
//		   i++;    // increament by 1 
//	   }
		
		for(int i = 1 ; i<=10 ; i++)    // condition 
		{
		System.out.println(num + " * "+ i + " = " + num *i);
		}
	}
	
	
	

}
