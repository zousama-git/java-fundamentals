import java.util.Scanner;

public class LogicalOPerators {
	public static void main(String[] args){

		//&& and
		//|| or
		// ! not

		//example 1
		double temp = -20;
		boolean isSunny = !true;

		if (temp <= 30 && temp >=0 && isSunny){
			System.out.println ( "The weather is good" );
			System.out.println ("It is sunny outside" );
		}
		else if (temp <= 30 && temp >=0 && !isSunny){
			System.out.println ( "The weather is good" );
			System.out.println ("It is NOT sunny outside" );
		}
		else if (temp > 30 || temp <0 && !isSunny){
			System.out.println ( "The weather is Bad" );
			System.out.println ("It is sunny outside" );
		}

		//example 2
		Scanner input = new Scanner(System.in);
		//username must be between 4 to 12 char
		//no spaces or underscore

		System.out.print("Enter username: ");
		String username = input.nextLine();

		if (username.length ()>=4 && username.length ()<=12 && !username.contains(" ") && !username.contains ( "_")){
			System.out.printf("hello %s", username);
		}
		else {
			System.out.println ("Invalid username" );
		}

		input.close ();
	}
}
