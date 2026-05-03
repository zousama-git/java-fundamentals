public class Main {
    public static void main(String [] args){
		
		//these are 1d
        String fruits[] = {"apple","orange", "banana"};
		String vegetables[] = {"potato","onion", "carrot"};
		String meats[] = {"chicken","pork", "beef","fish"};
		
		//2d
		String[][] groceries = {fruits, vegetables, meats};
		
		//replacing
		groceries[0][0] ="pineapple";
		groceries[1][0] ="celery";
		groceries[3][2] ="eggs";
		
		for (String[] foods : groceries){
			for(String food : foods){
				System.out.println(food);
			}
			System.out.println("");
		}
    }
}