package week_1;

public class Simple_array {
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		
		System.out.println("The second digit is: " +numbers[2]);
		
		System.out.println("All the digits are:");
		for(int number : numbers) {
			System.out.println(number);
			}
	}

}
