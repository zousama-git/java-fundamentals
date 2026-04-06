Day 2

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