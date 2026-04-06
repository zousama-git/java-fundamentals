import java.util.Scanner;

//this will be a compound interest calculator
public class Compound_Interest {
    public static void main(String[] args){
        //input and assignment
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principle amount: ");
        double P = input.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        double r = input.nextDouble()/100;

        System.out.print("Enter the # of times compounded per year: ");
        int n = input.nextInt();

        System.out.print("Enter the # of years: ");
        int t = input.nextInt();

        //math using the actual calculator
        double amount = P * ( Math.pow((1+(r/n)),(n*t)));

        //output using printf
        System.out.printf("The amount after %d years is R%.2f", n, amount);

        //end the input
        input.close();
    }
}
