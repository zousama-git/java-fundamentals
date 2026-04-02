import java.util.Scanner;

public class maths {
    public static void main(String[] args){
        //constants
        System.out.println("Pi: "+Math.PI);
        System.out.println("E: "+Math.E);

        //methods
        System.out.println("2 to the power of 3 is " + Math.pow(2, 3));
        System.out.println("Absolute of -99 is: "+Math.abs(-99));
        System.out.println("The square root of ( is: "+ Math.sqrt(9));
        System.out.println("round of PI: " + Math.round(Math.PI));
        System.out.println("Round UP Pi: " + Math.ceil(Math.PI));
        System.out.println("Round UP Pi+ 0.70: " + Math.floor(Math.PI + 0.70));
        System.out.println("Greater number between 10 and 20 is :"+ Math.max(10,20));
        System.out.println("Lesser number between 10 and 20 is: "+ Math.min(10,20));

        /* exercise 1
        Hypotenuse of a right triangle
         c=(a^2+b^2)^2 */

        //Input
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Enter the length of A: ");
        double aT = scanner.nextDouble();

        System.out.print("Enter the length of B: ");
        double bT = scanner.nextDouble();

        //MATH
        double aTCal = Math.pow(aT,2);
        double bTCal = Math.pow(bT,2);
        double cTCal = Math.sqrt(aTCal + bTCal);
        double answer = Math.round(cTCal);

        //OUTPUT
        System.out.println("Your answer is: " + answer + "cm");

        /* Exercise 2
         * the circumference
         * area
         * volume*/

        //input
        System.out.println(" ");
        System.out.print("What is the length of your radius: ");
        double rC = scanner.nextDouble();

        //math
        double C = 2 * Math.PI * rC;
        double A =Math.PI * Math.pow(rC,2);
        double SA = 4 * Math.PI * Math.pow(rC,2);
        double V = ((double) 4 /3) * Math.PI * Math.pow(rC,3);

        //output
        System.out.println(" ");
        System.out.printf("Your circumference is: %.2f\n",C);
        System.out.printf("Your Area is: %.2fcm\n",A);
        System.out.printf("Your Surface are is: %.2fcm2\n",SA);
        System.out.printf("Your Volume is: %.2fcm3\n",V);

        //END Input
        scanner.close();
    }
}
