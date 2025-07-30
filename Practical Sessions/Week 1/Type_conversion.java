package week_1;

public class Type_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		double d = i;
		System.out.println("Implicit:");
		System.out.println("Integer: " +i);
		System.out.println("Double: " +d);
		
		double d2 = 420.69;
		int i2 = (int) d2;
		System.out.println("\nExplicit:");
		System.out.println("Double now: " +d2);
		System.out.println("Integer now: " +i2);
		
		String str1 = "1234";
		int i3 = Integer.parseInt(str1);
		System.out.println("\nConversion of String to Integer:");
		System.out.println("String now: " +str1);
		System.out.println("Integer now: " +i3);
		
		int i4 = 5678;
		String str2 = Integer.toString(i4);
		System.out.println("\nConversion of Integer to String:");
		System.out.println("Integer now: " +i4);
		System.out.println("String now: " +str2);
		
	}

}
