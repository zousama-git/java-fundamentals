import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What # of food do you want?: ");
        int size = input.nextInt();
        input.nextLine();

        String food []= new String[size];

        for(int i=0;i<food.length;i++){
            System.out.print("Enter food: ");
            food[i] = input.nextLine();
        }
        
        System.out.println("");
        System.out.println("Your foods are: ");
        for (int i =0; i<food.length;i++){
            System.out.println(food[i]);
        }
        input.close();
    }    
}