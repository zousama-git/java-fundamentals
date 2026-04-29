import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws InterruptedException {
		System.out.println("inc");
		for (int i=1;i<=10;i++){
		System.out.println(i);
		}
		
		System.out.println("dec");
		for (int i=10;i>0;i--){
		System.out.println(i);
		}
		
		System.out.println("inc by 2");
		for (int i=1;i<10;i+=2){
		System.out.println(i);
		}
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many times do you want to loop?: ");
		int max = input.nextInt();
		
		for (int i = 1; i < max; i++){
			System.out.println(i);
		}

		System.out.print("You want to count down from how many seconds?: ");
		int start = input.nextInt();
		
		for (int i = start; i>0; i--){
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("HAPPPY NEW YEAR");
		
		input.close();
	}
}