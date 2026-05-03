public class Main {
    public static void main(String [] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        String[] fruits = {"apple", "orange", "banana"};
        String target2 = "orange";
        int target = 21;
        boolean isFound = false;

        for (int i = 0; i<fruits.length; i++){
            if (target2 == fruits[i]){
                System.out.println("Found at position: "+(i+1) );
                break;
            } 
       }

        for (int i = 0; i<numbers.length; i++){
            if (target == numbers[i]){
                System.out.println("Found at position: "+(i+1) );
                isFound = true;
                break;
            } 
       }

       if (!isFound) System.out.println("Not found on the array");
    }    
}