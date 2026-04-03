Day 1

	1. First Project (main.java)
    		Started a New Project
    		Made a Java File: Inside project, I would created a new Java class file named Main.

	2. The Main Method for every Java program to run:
		public static void main(String[] args) { ... }
		Printed a Message: Using the command System.out.println("xyz");

	3. Running and Testing
		Learned Shortcuts
		Added Notes: // and */ */

Day 2 <br>

	(main.java)
	1. Learned the Two Steps of Creating a Variable
		Declaration: Telling the computer the type and name
		Assignment: Giving that variable a specific value using the equals sign

	2. Mastered the Four "Primitive" Data Types
		int (Integers), double, char, Boolean

	3. "Reference" Types (Strings)

	4. Practiced buy builing descriptive sentences in the console:
		Mixing strings, numbers, and symbols etc.
		Using a Boolean to toggle a message

	(variables_input.java)

	5. Getting the "Scanner" Tool
		declaring variable java.util.Scanner;
		Setting it up: Scanner scanner = new Scanner(System.in);
		Closing it: scanner.close(); 

	6. Different types
		Words (Strings): Using scanner.nextLine(); to ask for a name
		Numbers (Integers): Using scanner.nextInt(); to ask for an age
		Decimals (Doubles): Using scanner.nextDouble(); to ask for a GPA
		True/False (Booleans): Using scanner.nextBoolean(); to ask if someone is a student

	7. Fixing a Common "Bug"
		Java "glitch", if you ask for a number and then a word, the program sometimes skips the word! 
		Then "clean" the scanner by adding an extra scanner.nextLine(); in between

	8. Built a "Rectangle Calculator"

Day 3

	1. Built a Mad Libs game to practice using the Scanner class to handle multiple user inputs and combine them into a story. Example: If the user enters "adjective," "noun," "adjective," "verb," and "adjective."
	2. Arithmetic
		a) Basic Arithmetic Operators
			Addition (+), Subtraction (-), Multiplication (*), Division (/), Modulus (%) (This gives you the remainder of a division)

		b) Augmented Assignment Operators
			These are shortcuts for performing an operation and then reassigning the result to the same variable
			Addition: x += y is the same as x = x + y
			Subtraction: x -= y
			Multiplication: x *= y
			Division: x /= y

		c) Increment and Decrement
			Commonly used in loops, these operators change a value by exactly 1
			Increment (++): x++ increases the value by 1
			Decrement (--): x-- decreases the value by 1

		d) Order of Operations (PEMDAS or BODMAS)

Day 4<br>

	1. Built a simple Shopping Cart Program in Java as a follow-up exercise to practice user input, variables, and basic arithmetic.
		Input: Ask the user for the item name (string), price (double), and quantity (integer)
		Process: Calculate the total cost by multiplying price and quantity (total as double) (total = price * quantity;)
		Output: Display a summary of the purchase (R as charcter) and the final total
			"You have bought [quantity] [item]/s"
			"Your total is: R[total]"

	2. If statements
		a) An if statement checks a condition inside parentheses. If the condition is true, the code inside the curly braces {} runs. If it's false, the program skips it
			else: Acts as a "catch-all"
			else if: Allows you to check multiple, specific conditions in a row

		b) Important Rules to Remember is that
			Order Matters
			To check if two things are equal, use the double equals (==) operator
			When working with booleans, you don't need to write if (isStudent == true). You can simply write if (isStudent)

Day 5 [Randoms (randoms.java)]

	- the "Random" util from Java's library and Creating a "Random" machine named random
	- counts the first number but stops right before the last one (x+1)

	what was done:
		1) The Coin Flip Game that use a "Boolean" to simulate a coin flip and use an if statement; "If it's true, print 'Heads.' If it's false, print 'Tails.'"
		2) Use the nextInt method with a bound of 101 to generate numbers up to 100.
		3) nextDouble, which generates a decimal between 0 and 1.
		4) simulate rolling a six-sided die.

Day 6 [math (maths.java)] <br>

	1) constants such as PI and e
	2)power to: pow(num1,num2)
	3) square root: sqrt(num1,num2)
	4) absolute: abs(num)
	5) Math.ceil(num) (round up) and Math.floor(num) (round down)
	6) Math.max(num1,num2) and Math.min(num1,num2), to compare numbers

	activities:
		The Triangle Challenge (Hypotenuse)
		Circle formulars (circumference, area, volume)
================================================================
