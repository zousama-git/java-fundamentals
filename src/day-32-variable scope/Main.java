import java.util.Scanner;

public class Main{
	
	static int x = 3;//class
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(x);
		
		x = 4; // update class
		System.out.println(x);
		
		int x = 1; // local
		System.out.println(x);
		
		doSomething();
	}
	static void doSomething(){
		int x =2;//local
		System.out.print(x);
	}
}