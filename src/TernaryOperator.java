import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class TernaryOperator {
	public static void main(String[] args){
		int score = 55;

		//instead of doing this you can us Ternary operators

		/* if (score >= 60){
			System.out.println ("Pass" );
		}
		else {
			System.out.println ("fail" );
		} */

		//example 1
		String passOrFail = (score >= 60 ) ? "Pass" : "fail";
		System.out.println (passOrFail );

		//example 2
		int number = 5;
		String evenorOdd = (number % 2 == 0 ) ? "Even" : "Odd";
		System.out.println ( evenorOdd);

		//example 3
		int hours = 10;
		String timeOfDay = (hours >= 12) ? "P.M.":"A.M.";
		System.out.println ( timeOfDay );

		//example 4
		int income = 60000;
		String taxRate = (income >= 4000) ? "0.25" : "0.15";
		System.out.println (taxRate);

	}
}
