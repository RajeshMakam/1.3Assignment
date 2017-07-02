package bitwieselogical;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
	
		Scanner userInput = new Scanner(System.in);
		System.out.println("Bitwise AND **********************");
		int number1 = userInput.nextInt();
		int number2 = userInput.nextInt();
		int bitwiseOutNumber;
		bitwiseOutNumber = number1 & number2;
		
		System.out.println(bitwiseOutNumber);
		System.out.println("Logical AND **********************");
		
		int number3 = userInput.nextInt();
		int number4 = userInput.nextInt();
		
		boolean bool = (number3 > 1) && (number4 < 2); 
		System.out.println(bool);
		
	}

}
