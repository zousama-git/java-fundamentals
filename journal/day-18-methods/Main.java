public class Main{

	public static void main(String[]args){
		String surname = "Dave";
		String name = "John";
		
		String fullName = getFullName(name, surname);
		
		int age =21;
		
		happyBirth(name, age);
		happyBirth(name, age);
		
		if (ageCheck(age)) System.out.println("you now old!");
			else System.out.println("you now old!");
		
		System.out.println(square(age));
		System.out.println(cube(age));
	}
	
	static void happyBirth(String name, int age){
		System.out.println("Happy Birthday to you");
		System.out.printf("Happy Birthday to %s\n", name);
		System.out.printf("You are %d years old!\n", age);
		System.out.println("Happy Birthday to you \n");
	}
	
	static double square(int x){
		return x*x;
	}
	
	static double cube(int x){
		return x*x*x;
	}
	
	static String getFullName(String first, String last){
		return first+" "+last;
	}
	
	static boolean ageCheck(int age){
		if (age >= 18) return true;
		else return false;
	}
}