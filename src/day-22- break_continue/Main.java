public class Main{
	
	public static void main(String[] args){
		
		//break used to stop		
		for (int i = 0; i <10 ; i++){
			if (i==5) break;
			System.out.print(i+" ");
		}	
		
		//continue used to skip the iteration	
		:loopHere
		for (int i = 0; i <10 ; i++){
			if (i==5) continue;
			System.out.print(i+" ");
		}	
			
	}
	
}