import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter the number of rows: ");
		int rows = input.nextInt();
		System.out.print("Enter the number of columns: ");
		int columns = input.nextInt();
		System.out.print("Enter the symbol to use: ");
		char symbol = input.next().charAt(0);
	
		for (int i = 0;i<rows;i++){
			for (int j= 0;j<columns;j++){
				System.out.print(symbol);
			}
			System.out.println();
		}
		
		input.close();
				
		for (int i=1; i<=3;i++){			
			for (int j=1; j<=4;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}