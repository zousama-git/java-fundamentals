import java.util.Scanner;

public class WhileLoops {
    static void main(String[] args) {

        //while loops

        Scanner input = new Scanner(System.in);

        String response = "";
        String name = "";
        int age= 0;

        //Enter number within a range
        int range =0;

        do{
            System.out.print("Enter a number between 1 and 10: ");
            range = input.nextInt();
        } while (range<1 || range>10);
        System.out.printf("Your number is: %d\n",range);

        //enter age
        age = -1;

        do{
            System.out.println("Your age can't be negative");
            System.out.print("Enter you age: ");
            age = input.nextInt();
        } while (age<=0);

        System.out.printf("you are %d years old\n", age);

        //press q to escape the loops
        while (!response.equals("q")) {
            System.out.print("You are playing a game, press Q to quit: ");
            response = input.nextLine().toLowerCase();
        }
        System.out.println("You've quit the loop!");

        //loop till you enter name
        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = input.nextLine();
        }
        System.out.printf("Your name is %s", name);

        //INFINITE loop
        /* while (1==1){
            System.out.println("HELP, I AM STUCK IN A LOOP");
        }
         */

        input.close();

    }
}
