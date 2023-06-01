package com.calc.project.calculator;
	import java.util.Scanner;


	public class Calculator {		
		
		public static int Sum(int number1, int number2) {
			return number1 + number2;
		}
		public static int Subtract(int number1, int number2) {
			return number1 - number2;
		}
			
		public static int Multiply(int number1, int number2) {
			return number1 * number2;
		}

	
	public static int Divide(int number1, int number2) {
			if(number2==0) {
				throw new IllegalArgumentException("Number can not be divided by 0!");
			}
			else
			return number1 / number2;
		}
		
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the first number");
			int number1=sc.nextInt();
			System.out.println("Enter the second number");
			int number2=sc.nextInt();
			Calculator calculator=new Calculator();
			System.out.println("Addition "+calculator.Sum(number1,number2));
			System.out.println("Subtraction "+calculator.Subtract(number1,number2));
			System.out.println("Multiply "+calculator.Multiply(number1,number2));
			System.out.println("Divide "+calculator.Divide(number1,number2));
			sc.close();	
			
		}	

	}