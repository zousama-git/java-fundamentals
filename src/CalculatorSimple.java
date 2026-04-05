import java.util.Scanner;
import java.util.*;

public class CalculatorSimple {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print ("enter the first number: " );
		double num1 = input.nextDouble();
		System.out.print("Enter an operator (+,-,/,^,*): " );
		char operator= input.next().charAt(0);
		System.out.print ("Enter the second number: " );
		double num2 = input.nextDouble();

		switch(operator){
			case '+' -> System.out.println (num1+num2 );
			case '-' -> System.out.println (num1-num2 );
			case '/' -> {if (num2==0){
				System.out.println ("Cannot divide by zero" );
			} else {System.out.println (num1/num2 );}}
			case '*' -> System.out.println (num1*num2 );
			case '^' -> System.out.println (Math.pow(num1,num2));
			default -> System.out.println ("Enter a proper operator" );
		}

	}
}
