import java.util.Arrays;
public class Main {
    public static void main(String [] args){
        String fruits[] = {"Apple","orange","banna","coconut"};

        //display array index
        System.out.println(fruits[0]);
        System.out.println(fruits[1]); //this will take time so use a for loop
        //System.out.println(fruits[4]); //error

        //change value
        fruits[1] = "mango";

        int numOfFruits = fruits.length; //length of the array

        System.out.println("");
        for (int i = 0 ; i<numOfFruits;i++){ //traditional for loop
            System.out.println(fruits[i]);
        }
        
        Arrays.sort(fruits);//sorting
        Arrays.fill(fruits, "strawberry");

        System.out.println("");
        for (String fruit : fruits){ //enhanced for-loop
            System.out.println(fruit);
        }
    }    
}