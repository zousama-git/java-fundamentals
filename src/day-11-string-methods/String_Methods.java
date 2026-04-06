public class String_Methods {
	public static void main(String[] args){

		String name = "ZOU is the king";
		System.out.println (name );

		//length method
		int length = name.length();
		System.out.println (length );

		//get the character of a string
		char first = name.charAt(0); //1st
		char second = name.charAt(1); //2nd
		char third = name.charAt(2); //3rd
		System.out.print (first);
		System.out.print (second);
		System.out.println (third);

		//index
		int index = name.indexOf("i");
		int lastindex = name.lastIndexOf("i");
		System.out.println (index+1);
		System.out.println (lastindex+1 );

		//uppercase
		System.out.println (name.toUpperCase());
		System.out.println (name.toLowerCase() );

		//trim empty spaces
		String _name = "     I the only king left         ";
		System.out.println (_name.trim() );

		//replace char
		System.out.println (_name.replace("k","q").trim() );

		//check if its empty
		if (_name.isEmpty()){
			System.out.println ("String is empty" );
		}
		else {
			System.out.printf("String has %d characters but %d trimmed\n", _name.length() ,_name.trim().length ());
		}

		//check if it has a specific character
		String letter = "t";

		if (_name.contains(letter)){
			System.out.printf("The letter %s was found in space %d or %d \n",letter,_name.indexOf(letter), _name.lastIndexOf (letter));
		}
		else {
			System.out.printf(letter +" was not found");
		}

		//check if two strings are equal
		String __name ="I the only king left";
		if (_name.trim().equalsIgnoreCase(__name.toUpperCase())){
			System.out.println ("they are euqal" );
		}
		else {
			System.out.println ("They NOT equal" );
		}

	}
}
