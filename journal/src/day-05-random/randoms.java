import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class randoms {
    public static void main(String[] args){
        Random random = new Random();
        int number1 = random.nextInt(1,7);
        double number2 = random.nextDouble(1,3);
        boolean isHead = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);

        if (isHead) {
        System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }

    }
}
