

public class UsandoForEach {

	public static void main(String[] args) {
		
		int [] numberArray= { 10, 20,30,40,50};
		for(int number : numberArray){
		if(number == 30){
			break;
			//break printa so o que vem antes
			//continue não print o 30
		}
		System.out.println(number);
		
	}
		}
		

}
